/*
 * Created on 29-Dec-2003
 * 
 * (c) 2003-2004 ThoughtWorks
 * 
 * See license.txt for licence details
 */
package jbehave;
import jbehave.evaluate.EvaluatorBehaviour;
import jbehave.evaluate.listener.TextListenerBehaviour;
import jbehave.evaluate.listener.TimerBehaviour;
import jbehave.framework.Aggregate;
import jbehave.framework.CriterionBehaviour;
import jbehave.framework.CriterionEvaluationBehaviour;
import jbehave.framework.CriteriaSupportBehaviour;

/**
 * @author <a href="mailto:dan@jbehave.org">Dan North</a>
 */
public class AllBehaviour implements Aggregate {
    public Class[] getBehaviourClasses() {
        return new Class[] {
            CriterionBehaviour.class,
            CriterionEvaluationBehaviour.class,
            CriteriaSupportBehaviour.class,
            EvaluatorBehaviour.class,
            TextListenerBehaviour.class,
            TimerBehaviour.class
        };
    }
}
