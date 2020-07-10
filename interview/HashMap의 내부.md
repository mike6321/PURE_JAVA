## HashMap의 내부를 살펴보자

살펴 볼 코드는 단순히 이 두 줄이다.

~~~java
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("key", "value");
~~~

1. ### 시작점

```java
    public V put(K key, V value) {
        return putVal(hash(key), key, value, false, true);
    }
```

key의 hash 값을 구한다.

Key 값이 null 이면 0을 return 한다. - HashMap은 null을 지원한다는 것을 알 수 있다.

~~~java
    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
~~~

。비트 연산자  &, |, ^

  \- 비트연산자는 이진 비트연산을 합니다

​        | (or연산자) : 두개의 피연산자중 한개의 피연산자 값이 1이면 결과값은 1입니다. 그외에는 결과값 0 을 얻습니다.

​       & (and연산자) : 두개의 피연산자 모두 1이어야 결과값 1을 얻습니다. 그외에는 결과값 0 을 얻습니다.

​       ^ (xor연산자) : 두개의 피연산자의 값이 서로 다를떄만 결과값 1을 얻습니다. 같을때는 0을 얻습니다. 

![image](https://user-images.githubusercontent.com/33277588/73274915-ba9a7b00-4229-11ea-8d9a-8bc8ca2aa6b2.png)

현재 hashCode의 결과 값은 106079이다.

진짜 너무 궁금해서 한번 짜봤다.

~~~java
        while (true) {
            if (a<=0)
                break;

            a = a/2;
            list.add(a%2);
        }
        System.out.println("size :: "+list.size());
        for (int i : list) {
            System.out.print(list.get(i));
        }
~~~

```
1111111111111111110
0000000000000000001
xor 하니 결과 값은 +1한 값
hash() returned	106078	
이 된다.
```

2. ### putVal(**int** hash, K key, V value, **boolean** onlyIfAbsent,**boolean** evict) 속으로

```java
    final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int n, i;
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
            Node<K,V> e; K k;
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null;
    }
```

내부를 천천히 살펴보자

table과 tab의 값이 null 이거나 tab의 길이가 0 인지를 판단한다.

만약 해당된다면 tab의 크기를 조정한다. 

~~~java
Node<K,V>[] tab; 
Node<K,V> p;
transient Node<K,V>[] table;
~~~

코드는 복잡하지만 결론적으로 **DEFAULT_INITIAL_CAPACITY** 로 Node를 16개의 배열로 초기화 한다.

![image](https://user-images.githubusercontent.com/33277588/73278330-c76d9d80-422e-11ea-9a10-657c39421350.png)

이로써 HashMap에 16개의 공간이 생성되었다.

![image](https://user-images.githubusercontent.com/33277588/73278520-0f8cc000-422f-11ea-9a03-e20147ca88ea.png)

```java
if ((p = tab[i = (n - 1) & hash]) == null)
```

14의 값이 들어가는데 비전공자인 나로서는 이해가 안된다.

그래도 한번 해보자



hash (106078) - 11001111001011110 

n-1(15)            - 00000000000001111

이것을 & 연산을 하면

00000000000001110 이된다 이는 14 

아하!

![image](https://user-images.githubusercontent.com/33277588/73281359-351bc880-4233-11ea-916c-7ea8a3acf772.png)

이제 결론적으로 14번째의 버킷에 해시 값에 해당하는 key value 가 들어 간것을 볼 수 있다.


![image](https://user-images.githubusercontent.com/33277588/73281442-58467800-4233-11ea-993b-f3de7774f4cd.png)

