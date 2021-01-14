package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;

/* renamed from: X.1PL  reason: invalid class name */
public class AnonymousClass1PL extends Animator implements Animator.AnimatorListener {
    public ArrayList A00;
    public final Animator A01;

    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
    }

    public void pause() {
    }

    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
    }

    public void resume() {
    }

    public AnonymousClass1PL(Animator animator) {
        this.A01 = animator;
        animator.addListener(this);
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.A00;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A00 = arrayList;
        }
        arrayList.add(animatorListener);
    }

    public void cancel() {
        this.A01.cancel();
    }

    @Override // java.lang.Object, android.animation.Animator, android.animation.Animator
    public Animator clone() {
        AnonymousClass1PL r2 = (AnonymousClass1PL) super.clone();
        ArrayList arrayList = this.A00;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            r2.A00 = arrayList2;
            arrayList2.addAll(arrayList);
        }
        return r2;
    }

    @Override // java.lang.Object, android.animation.Animator, android.animation.Animator
    /* renamed from: clone  reason: collision with other method in class */
    public Object m0clone() {
        AnonymousClass1PL r2 = (AnonymousClass1PL) super.clone();
        ArrayList arrayList = this.A00;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            r2.A00 = arrayList2;
            arrayList2.addAll(arrayList);
        }
        return r2;
    }

    public void end() {
        this.A01.end();
    }

    public long getDuration() {
        return this.A01.getDuration();
    }

    public TimeInterpolator getInterpolator() {
        return this.A01.getInterpolator();
    }

    @Override // android.animation.Animator
    public ArrayList getListeners() {
        return this.A00;
    }

    public long getStartDelay() {
        return this.A01.getStartDelay();
    }

    public boolean isPaused() {
        return this.A01.isPaused();
    }

    public boolean isRunning() {
        return this.A01.isRunning();
    }

    public boolean isStarted() {
        return this.A01.isStarted();
    }

    public void onAnimationCancel(Animator animator) {
        for (Animator.AnimatorListener animatorListener : (ArrayList) this.A00.clone()) {
            animatorListener.onAnimationCancel(this);
        }
    }

    public void onAnimationEnd(Animator animator) {
        for (Animator.AnimatorListener animatorListener : (ArrayList) this.A00.clone()) {
            animatorListener.onAnimationEnd(this);
        }
    }

    public void onAnimationRepeat(Animator animator) {
        for (Animator.AnimatorListener animatorListener : (ArrayList) this.A00.clone()) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    public void onAnimationStart(Animator animator) {
        for (Animator.AnimatorListener animatorListener : (ArrayList) this.A00.clone()) {
            animatorListener.onAnimationStart(this);
        }
    }

    public void removeAllListeners() {
        ArrayList arrayList = this.A00;
        if (arrayList != null) {
            arrayList.clear();
            this.A00 = null;
        }
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.A00;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
            if (this.A00.isEmpty()) {
                this.A00 = null;
            }
        }
    }

    public Animator setDuration(long j) {
        this.A01.setDuration(j);
        return this;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.A01.setInterpolator(timeInterpolator);
    }

    public void setStartDelay(long j) {
        this.A01.setStartDelay(j);
    }

    public void setTarget(Object obj) {
        this.A01.setTarget(obj);
    }

    public void setupEndValues() {
        this.A01.setupEndValues();
    }

    public void setupStartValues() {
        this.A01.setupStartValues();
    }

    public void start() {
        this.A01.start();
    }
}
