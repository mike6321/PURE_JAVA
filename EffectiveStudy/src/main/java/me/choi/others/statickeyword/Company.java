package me.choi.others.statickeyword;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/04
 * Time : 8:43 오후
 */
class Company {

    static String companyName;
    static int cnt = 0;

    private final String name;
    private final int id;

    public Company(String name, int id) {
        this.name = name;
        this.id = id;

        cnt++;
    }


    public static void main(String[] args) {
        Company company0 = new Company("choi",01234);
        Company company1 = new Company("kim",01235);

        System.out.println("생성 횟 수 : "+Company.cnt);

        Company.companyName = "카카오";
        Company.companyName = "라인";
        Company.companyName = "네이버";

        System.out.println(Company.companyName);

    }
}
