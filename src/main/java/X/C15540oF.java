package X;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.0oF  reason: invalid class name and case insensitive filesystem */
public class C15540oF implements Transition.TransitionListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ArrayList A01;

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public C15540oF(View view, ArrayList arrayList) {
        this.A00 = view;
        this.A01 = arrayList;
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.A00.setVisibility(8);
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    public void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
