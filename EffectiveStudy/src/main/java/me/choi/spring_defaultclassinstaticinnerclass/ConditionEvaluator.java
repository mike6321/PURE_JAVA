package me.choi.spring_defaultclassinstaticinnerclass;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/01
 * Time : 4:15 오후
 */
class ConditionEvaluator {

    private final ConditionContextImpl context;

    public ConditionEvaluator(String registry, String environment) {
        this.context = new ConditionContextImpl(registry, environment);
    }

    private static class ConditionContextImpl {
        private final String registry;
        private final String Environment;

        public ConditionContextImpl(String registry, String environment) {
            this.registry = registry;
            Environment = environment;
        }
    }
}
