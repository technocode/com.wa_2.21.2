package X;

import android.transition.Transition;
import java.util.ArrayList;

/* renamed from: X.0oG  reason: invalid class name and case insensitive filesystem */
public class C15550oG implements Transition.TransitionListener {
    public final /* synthetic */ C30221ax A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ ArrayList A04;
    public final /* synthetic */ ArrayList A05;
    public final /* synthetic */ ArrayList A06;

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public C15550oG(C30221ax r1, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.A00 = r1;
        this.A01 = obj;
        this.A04 = arrayList;
        this.A02 = obj2;
        this.A05 = arrayList2;
        this.A03 = obj3;
        this.A06 = arrayList3;
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    public void onTransitionStart(Transition transition) {
        Object obj = this.A01;
        if (obj != null) {
            this.A00.A0H(obj, this.A04, null);
        }
        Object obj2 = this.A02;
        if (obj2 != null) {
            this.A00.A0H(obj2, this.A05, null);
        }
        Object obj3 = this.A03;
        if (obj3 != null) {
            this.A00.A0H(obj3, this.A06, null);
        }
    }
}
