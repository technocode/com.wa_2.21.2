package X;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1bQ  reason: invalid class name and case insensitive filesystem */
public class C30481bQ implements AbstractC16440po {
    public final /* synthetic */ C30511bT A00;

    public C30481bQ(C30511bT r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC16440po
    public boolean AGn(RecyclerView recyclerView, MotionEvent motionEvent) {
        C30511bT r3 = this.A00;
        r3.A0H.A00.AL5(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            r3.A09 = motionEvent.getPointerId(0);
            r3.A02 = motionEvent.getX();
            r3.A03 = motionEvent.getY();
            VelocityTracker velocityTracker = r3.A0F;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            r3.A0F = VelocityTracker.obtain();
            if (r3.A0L == null && !r3.A0O.isEmpty()) {
                View A03 = r3.A03(motionEvent);
                int size = r3.A0O.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    C16190pP r6 = (C16190pP) r3.A0O.get(size);
                    AbstractC11910hD r5 = r6.A0C;
                    View view = r5.A0H;
                    if (view == A03) {
                        r3.A02 -= r6.A01;
                        r3.A03 -= r6.A02;
                        r3.A08(r5, true);
                        if (r3.A0S.remove(view)) {
                            AbstractC16160pM.A00(r5);
                        }
                        r3.A07(r5, r6.A0A);
                        r3.A04(motionEvent, r3.A0B, 0);
                    } else {
                        size--;
                    }
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            r3.A09 = -1;
            r3.A07(null, 0);
        } else {
            int i = r3.A09;
            if (i != -1 && motionEvent.findPointerIndex(i) >= 0 && r3.A0L == null && actionMasked == 2 && r3.A08 != 2 && r3.A0I == null) {
                throw null;
            }
        }
        VelocityTracker velocityTracker2 = r3.A0F;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (r3.A0L != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC16440po
    public void AJO(boolean z) {
        if (z) {
            this.A00.A07(null, 0);
        }
    }

    @Override // X.AbstractC16440po
    public void AL4(RecyclerView recyclerView, MotionEvent motionEvent) {
        C30511bT r3 = this.A00;
        r3.A0H.A00.AL5(motionEvent);
        VelocityTracker velocityTracker = r3.A0F;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (r3.A09 != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(r3.A09);
            if (findPointerIndex >= 0 && r3.A0L == null && actionMasked == 2 && r3.A08 != 2 && r3.A0I == null) {
                throw null;
            }
            AbstractC11910hD r1 = r3.A0L;
            if (r1 != null) {
                int i = 0;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            VelocityTracker velocityTracker2 = r3.A0F;
                            if (velocityTracker2 != null) {
                                velocityTracker2.clear();
                            }
                        } else if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == r3.A09) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                r3.A09 = motionEvent.getPointerId(i);
                                r3.A04(motionEvent, r3.A0B, actionIndex);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (findPointerIndex >= 0) {
                        r3.A04(motionEvent, r3.A0B, findPointerIndex);
                        r3.A06(r1);
                        RecyclerView recyclerView2 = r3.A0M;
                        Runnable runnable = r3.A0R;
                        recyclerView2.removeCallbacks(runnable);
                        runnable.run();
                        r3.A0M.invalidate();
                        return;
                    } else {
                        return;
                    }
                }
                r3.A07(null, 0);
                r3.A09 = -1;
            }
        }
    }
}
