package com.unicatolica.listener;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class LifeCycleListener implements PhaseListener {

	private static final long serialVersionUID = 4945759108172593113L;

	public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

    public void beforePhase(PhaseEvent event) {
        System.out.println("INICIANDO FASE: " + event.getPhaseId());
    }

    public void afterPhase(PhaseEvent event) {
        System.out.println("FINALIZANDO FASE: " + event.getPhaseId());
        System.out.println("-----------------------------------------");
    }
}