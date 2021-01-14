package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.components.SegmentedProgressBar;

/* renamed from: X.2Fq  reason: invalid class name and case insensitive filesystem */
public class C46922Fq extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SegmentedProgressBar A01;
    public final /* synthetic */ float[] A02;

    public C46922Fq(SegmentedProgressBar segmentedProgressBar, float[] fArr, int i) {
        this.A01 = segmentedProgressBar;
        this.A02 = fArr;
        this.A00 = i;
    }

    public void onAnimationEnd(Animator animator) {
        SegmentedProgressBar segmentedProgressBar = this.A01;
        segmentedProgressBar.A08 = null;
        float[] fArr = this.A02;
        int i = this.A00;
        segmentedProgressBar.A0A = fArr;
        segmentedProgressBar.A02 = i;
    }
}
