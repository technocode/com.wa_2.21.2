package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: X.0aQ  reason: invalid class name and case insensitive filesystem */
public class C08070aQ {
    public int A00 = 0;
    public int A01 = 1;
    public long A02 = 0;
    public long A03 = 300;
    public TimeInterpolator A04 = null;

    public C08070aQ(long j) {
        this.A02 = j;
        this.A03 = 150;
    }

    public C08070aQ(long j, long j2, TimeInterpolator timeInterpolator) {
        this.A02 = j;
        this.A03 = j2;
        this.A04 = timeInterpolator;
    }

    public void A00(Animator animator) {
        animator.setStartDelay(this.A02);
        animator.setDuration(this.A03);
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C08060aP.A02;
        }
        animator.setInterpolator(timeInterpolator);
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.A00);
            valueAnimator.setRepeatMode(this.A01);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C08070aQ.class != obj.getClass()) {
            return false;
        }
        C08070aQ r7 = (C08070aQ) obj;
        if (this.A02 != r7.A02 || this.A03 != r7.A03 || this.A00 != r7.A00 || this.A01 != r7.A01) {
            return false;
        }
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C08060aP.A02;
        }
        Class<?> cls = timeInterpolator.getClass();
        TimeInterpolator timeInterpolator2 = r7.A04;
        if (timeInterpolator2 == null) {
            timeInterpolator2 = C08060aP.A02;
        }
        return cls.equals(timeInterpolator2.getClass());
    }

    public int hashCode() {
        long j = this.A02;
        long j2 = this.A03;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C08060aP.A02;
        }
        return ((((timeInterpolator.getClass().hashCode() + i) * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C08070aQ.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.A02);
        sb.append(" duration: ");
        sb.append(this.A03);
        sb.append(" interpolator: ");
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C08060aP.A02;
        }
        sb.append(timeInterpolator.getClass());
        sb.append(" repeatCount: ");
        sb.append(this.A00);
        sb.append(" repeatMode: ");
        return AnonymousClass008.A0N(sb, this.A01, "}\n");
    }
}
