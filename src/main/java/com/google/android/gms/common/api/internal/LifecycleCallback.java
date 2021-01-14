package com.google.android.gms.common.api.internal;

import X.AbstractC04610La;
import X.AbstractDialogInterface$OnCancelListenerC35011ja;
import X.AnonymousClass17J;
import X.AnonymousClass17K;
import X.AnonymousClass261;
import X.C237217g;
import X.C34661ix;
import android.app.PendingIntent;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

public class LifecycleCallback {
    public final AbstractC04610La A00;

    public static AbstractC04610La getChimeraLifecycleFragmentImpl(AnonymousClass17K r1) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public LifecycleCallback(AbstractC04610La r1) {
        this.A00 = r1;
    }

    public void A00() {
        if (this instanceof AnonymousClass261) {
            AnonymousClass261 r1 = (AnonymousClass261) this;
            if (!r1.A01.isEmpty()) {
                r1.A00.A02(r1);
            }
        }
    }

    public void A01() {
        if (this instanceof AnonymousClass261) {
            AnonymousClass261 r1 = (AnonymousClass261) this;
            r1.A03 = true;
            if (!r1.A01.isEmpty()) {
                r1.A00.A02(r1);
            }
        }
    }

    public void A02() {
        if (this instanceof AnonymousClass261) {
            AnonymousClass261 r4 = (AnonymousClass261) this;
            r4.A03 = false;
            AnonymousClass17J r3 = r4.A00;
            if (r3 != null) {
                synchronized (AnonymousClass17J.A0G) {
                    if (r3.A03 == r4) {
                        r3.A03 = null;
                        r3.A09.clear();
                    }
                }
                return;
            }
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (r3 != false) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(int r8, int r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.A03(int, int, android.content.Intent):void");
    }

    public void A04(Bundle bundle) {
        C237217g r0;
        if (this instanceof AbstractDialogInterface$OnCancelListenerC35011ja) {
            AbstractDialogInterface$OnCancelListenerC35011ja r02 = (AbstractDialogInterface$OnCancelListenerC35011ja) this;
            if (bundle != null) {
                AtomicReference atomicReference = r02.A02;
                if (bundle.getBoolean("resolving_error", false)) {
                    r0 = new C237217g(new C34661ix(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
                } else {
                    r0 = null;
                }
                atomicReference.set(r0);
            }
        }
    }

    public void A05(Bundle bundle) {
        C237217g r2;
        if ((this instanceof AbstractDialogInterface$OnCancelListenerC35011ja) && (r2 = (C237217g) ((AbstractDialogInterface$OnCancelListenerC35011ja) this).A02.get()) != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", r2.A00);
            C34661ix r22 = r2.A01;
            bundle.putInt("failed_status", r22.A01);
            bundle.putParcelable("failed_resolution", r22.A02);
        }
    }
}
