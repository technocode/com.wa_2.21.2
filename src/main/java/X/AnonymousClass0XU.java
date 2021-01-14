package X;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.CameraHomeFragment;
import com.whatsapp.HomeActivity;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.collections.observablelistview.ObservableListView;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.0XU  reason: invalid class name */
public class AnonymousClass0XU extends AnonymousClass0XV {
    public boolean A00 = false;
    public final /* synthetic */ HomeActivity A01;

    public AnonymousClass0XU(HomeActivity homeActivity) {
        this.A01 = homeActivity;
    }

    public final void A00() {
        boolean z;
        HomeActivity homeActivity = this.A01;
        AnonymousClass0YW r2 = homeActivity.A0P;
        boolean z2 = false;
        if (r2.A0L != null) {
            z2 = true;
        }
        if (!z2) {
            CameraHomeFragment cameraHomeFragment = homeActivity.A0K;
            if (cameraHomeFragment != null) {
                cameraHomeFragment.A0T(true);
            }
            homeActivity.getLayoutInflater().inflate(R.layout.camera_view, (ViewGroup) homeActivity.findViewById(R.id.camera_frame), true);
            AnonymousClass0YW r4 = homeActivity.A0P;
            C000300f r1 = homeActivity.A0g;
            if (r1.A0D(AbstractC000400g.A29) || (homeActivity.A1P.A04() && r1.A0D(AbstractC000400g.A1w))) {
                z = true;
            } else {
                z = false;
            }
            r4.A0F(homeActivity, null, 0, null, false, null, null, null, null, z, false);
        } else {
            r2.A05();
        }
        if (RequestPermissionActivity.A0K(homeActivity, homeActivity.A0z, 30)) {
            AnonymousClass00C r12 = homeActivity.A0t;
            if (r12.A09(homeActivity.A0s)) {
                if (r12.A02() < ((long) ((homeActivity.A0g.A06(AbstractC000400g.A3a) << 10) << 10))) {
                    C28051Sr.A1Z(homeActivity.A1G, homeActivity, homeActivity, 5);
                } else {
                    homeActivity.A0P.A06();
                    return;
                }
            }
        }
        homeActivity.A0P.A0x.A01 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r2 != 3) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f1, code lost:
        if (r5 != false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bc  */
    @Override // X.AnonymousClass0XW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AIG(int r11, float r12, int r13) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XU.AIG(int, float, int):void");
    }

    @Override // X.AnonymousClass0XW
    public void AIH(int i) {
        int i2;
        int i3;
        HomeActivity homeActivity = this.A01;
        AbstractC06110Rt r0 = homeActivity.A0G;
        if (r0 != null) {
            r0.A00();
        }
        homeActivity.A0l(true);
        homeActivity.A03 = homeActivity.A0U(i);
        homeActivity.A0f();
        int i4 = homeActivity.A03;
        if (i4 == 400) {
            AnonymousClass02M r02 = ((ActivityC004702f) homeActivity).A0F;
            Runnable runnable = homeActivity.A1r;
            Handler handler = r02.A02;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 500);
        } else if (i4 == 200) {
            AnonymousClass02M r03 = ((ActivityC004702f) homeActivity).A0F;
            Runnable runnable2 = homeActivity.A1q;
            Handler handler2 = r03.A02;
            handler2.removeCallbacks(runnable2);
            handler2.postDelayed(runnable2, 500);
        } else if (i4 == 300) {
            AnonymousClass02M r04 = ((ActivityC004702f) homeActivity).A0F;
            Runnable runnable3 = homeActivity.A1s;
            Handler handler3 = r04.A02;
            handler3.removeCallbacks(runnable3);
            handler3.postDelayed(runnable3, 500);
        }
        AnonymousClass037 A0Y = homeActivity.A0Y();
        Iterator it = ((AbstractCollection) homeActivity.A0D()).iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass037 r1 = (AnonymousClass037) it.next();
            if (r1 instanceof AbstractC07520Xz) {
                AbstractC07520Xz r05 = (AbstractC07520Xz) r1;
                if (A0Y == r1) {
                    z = true;
                }
                r05.AP2(z);
            }
        }
        if (A0Y != null) {
            homeActivity.A0N.A01((AnonymousClass0Y2) A0Y);
        }
        if (homeActivity.A03 != 100) {
            ObservableListView A0b = homeActivity.A0b();
            if (A0b != null && A0b.getChildCount() > 0) {
                int height = homeActivity.A0O.getHeight();
                if (A0b.getFirstVisiblePosition() > 0) {
                    i2 = height;
                } else {
                    i2 = -A0b.getChildAt(0).getTop();
                }
                View childAt = A0b.getChildAt(A0b.getChildCount() - 1);
                if (childAt.getBottom() > A0b.getBottom()) {
                    i3 = childAt.getBottom() - A0b.getBottom();
                } else {
                    i3 = 0;
                }
                if (i2 + i3 >= height) {
                    int i5 = homeActivity.A01;
                    int i6 = A0b.A04;
                    if (i5 == 0) {
                        if (i6 > 0) {
                            A0b.setSelection(0);
                            return;
                        }
                        return;
                    } else if (i6 < homeActivity.A0I.getHeight()) {
                        A0b.setSelection(1);
                        return;
                    } else {
                        return;
                    }
                }
            }
            homeActivity.A0d();
        } else if (!this.A00) {
            this.A00 = true;
            A00();
        }
    }
}
