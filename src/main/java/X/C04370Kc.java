package X;

import android.os.Build;
import android.os.Environment;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.0Kc  reason: invalid class name and case insensitive filesystem */
public class C04370Kc {
    public static volatile C04370Kc A05;
    public final AnonymousClass02M A00;
    public final C000300f A01;
    public final AnonymousClass00C A02;
    public final AnonymousClass03S A03;
    public final AnonymousClass01X A04;

    public C04370Kc(AnonymousClass02M r1, C000300f r2, AnonymousClass01X r3, AnonymousClass00C r4, AnonymousClass03S r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public static C04370Kc A00() {
        if (A05 == null) {
            synchronized (C04370Kc.class) {
                if (A05 == null) {
                    A05 = new C04370Kc(AnonymousClass02M.A00(), C000300f.A00(), AnonymousClass01X.A00(), AnonymousClass00C.A00(), AnonymousClass03S.A00());
                }
            }
        }
        return A05;
    }

    public int A01() {
        return AnonymousClass00C.A01() ? R.string.gallery_media_not_exist : R.string.gallery_media_not_exist_shared_storage;
    }

    public void A02() {
        int A06 = this.A01.A06(AbstractC000400g.A3x);
        this.A00.A0C(this.A04.A0A(R.plurals.video_status_truncation_info, (long) A06, Integer.valueOf(A06)), 1);
    }

    public void A03(ActivityC004702f r5) {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            boolean A012 = AnonymousClass00C.A01();
            int i = R.string.need_sd_card_shared_storage;
            if (A012) {
                i = R.string.need_sd_card;
            }
            r5.APo(i);
        }
        if (Build.VERSION.SDK_INT < 23 || this.A03.A02("android.permission.READ_EXTERNAL_STORAGE") != -1) {
            r5.APo(A01());
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = R.string.permission_storage_need_write_access_v30;
        if (i2 < 30) {
            i3 = R.string.permission_storage_need_write_access;
        }
        RequestPermissionActivity.A09(r5, R.string.permission_storage_need_write_access_request, i3);
    }
}
