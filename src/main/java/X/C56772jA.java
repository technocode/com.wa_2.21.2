package X;

import android.app.Activity;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2jA  reason: invalid class name and case insensitive filesystem */
public class C56772jA implements AnonymousClass1W7 {
    public C007003k A00;
    public WeakReference A01;
    public final AnonymousClass02M A02;
    public final C014308b A03;
    public final AnonymousClass00C A04;
    public final AnonymousClass00Y A05;

    public C56772jA(AnonymousClass02M r2, AnonymousClass00Y r3, C014308b r4, AnonymousClass00C r5, Activity activity, C007003k r7) {
        this.A02 = r2;
        this.A05 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = new WeakReference(activity);
        this.A00 = r7;
    }

    public void A00(int i, int i2, int i3, Object... objArr) {
        WeakReference weakReference = this.A01;
        if (weakReference == null) {
            Log.i("basemediadownloadlistener/notifyuser/skip");
            return;
        }
        Activity activity = (Activity) weakReference.get();
        if (activity == null || C002001d.A3D(activity) || this.A02.A00 != activity) {
            Log.i("basemediadownloadlistener/notifyuser/skip");
            return;
        }
        AbstractC004502c r3 = (AbstractC004502c) activity;
        if (i == 4) {
            r3.APp(i2, i3, R.string.manage_storage_button_text, new C42921xV(activity, C28051Sr.A0o(4, this.A05), 4), objArr);
        } else {
            r3.APq(i2, i3, objArr);
        }
    }

    public void A01(AnonymousClass1W8 r8) {
        Activity activity;
        Activity activity2;
        if (!(this instanceof C60202oy)) {
            WeakReference weakReference = this.A01;
            if (weakReference == null) {
                activity2 = null;
            } else {
                activity2 = (Activity) weakReference.get();
                if (activity2 == null || C002001d.A3D(activity2) || this.A02.A00 != activity2) {
                    activity2 = null;
                }
            }
            if (activity2 == null) {
                Log.i("basemediadownloadlistener/notifyuser/skip");
                return;
            }
            int i = r8.A01;
            if (i == 9) {
                AnonymousClass00C r1 = this.A04;
                if (r1.A09(new C56812jE(r1, activity2))) {
                    A00(i, R.string.download_failed, R.string.unable_to_finish_download, new Object[0]);
                }
            } else if (i == 4) {
                A00(i, R.string.download_failed, R.string.insufficient_storage_dialog_subtitle, new Object[0]);
            } else if (i == 5) {
                C007003k r6 = this.A00;
                if (r6 != null) {
                    A00(i, R.string.download_failed, R.string.too_old_for_download, this.A03.A08(r6, false));
                    return;
                }
                A00(i, R.string.download_failed, R.string.invalid_url_for_download, new Object[0]);
            } else if (i == 8 || i == -1) {
                A00(i, R.string.download_failed, R.string.invalid_url_for_download, new Object[0]);
            } else {
                A00(i, R.string.download_failed, R.string.unable_to_finish_download, new Object[0]);
            }
        } else {
            WeakReference weakReference2 = this.A01;
            if (weakReference2 == null) {
                activity = null;
            } else {
                activity = (Activity) weakReference2.get();
                if (activity == null || C002001d.A3D(activity) || this.A02.A00 != activity) {
                    activity = null;
                }
            }
            if (activity == null) {
                Log.i("productdownloadlistener/notifyuser/skip");
                return;
            }
            int i2 = r8.A01;
            if (i2 == 9) {
                AnonymousClass00C r5 = this.A04;
                if (r5.A09(new C56812jE(r5, activity))) {
                    A00(i2, R.string.product_image_download_failed, R.string.unable_to_finish_download_product_image, new Object[0]);
                }
            } else if (i2 == 4) {
                boolean A012 = AnonymousClass00C.A01();
                int i3 = R.string.insufficient_space_for_download_product_image_shared_storage;
                if (A012) {
                    i3 = R.string.insufficient_space_for_download_product_image;
                }
                A00(i2, R.string.product_image_download_failed, i3, new Object[0]);
            } else if (i2 == 5) {
                A00(i2, R.string.product_image_download_failed, R.string.product_image_download_failed_too_old, new Object[0]);
            } else if (i2 == 8 || i2 == -1) {
                A00(i2, R.string.product_image_download_failed, R.string.invalid_url_for_product_image_download, new Object[0]);
            } else {
                A00(i2, R.string.product_image_download_failed, R.string.unable_to_finish_download_product_image, new Object[0]);
            }
        }
    }

    @Override // X.AnonymousClass1W7
    public void AFF(boolean z) {
        this.A01 = null;
    }

    @Override // X.AnonymousClass1W7
    public void AFG(AnonymousClass1W8 r7, C49982Sy r8) {
        if (this instanceof C60192ox) {
            C60192ox r3 = (C60192ox) this;
            if (!r7.A02()) {
                int i = r7.A01;
                if (i == 9) {
                    if (!r3.A02) {
                        r3.A01(r7);
                        r3.A02 = true;
                    }
                } else if (i == 4) {
                    if (!r3.A00) {
                        r3.A01(r7);
                        r3.A00 = true;
                    }
                } else if (i != 2 && i != 3 && i != 11) {
                    r3.A01(r7);
                } else if (!r3.A01) {
                    r3.A01(r7);
                    r3.A01 = true;
                }
            }
        } else if (this instanceof C60182ow) {
            C60182ow r5 = (C60182ow) this;
            if (r7.A02()) {
                C03500Gm r32 = r5.A00;
                synchronized (r32) {
                    Log.i("gdpr/on-report-downloaded");
                    AnonymousClass008.A0k(r32.A0D, "gdpr_report_state", 3);
                }
            } else {
                int i2 = r7.A01;
                if (i2 == 5 || i2 == 8) {
                    r5.A00(i2, R.string.download_failed, R.string.gdpr_download_expired, new Object[0]);
                    r5.A00.A05();
                } else if (i2 == 4) {
                    r5.A00(i2, R.string.download_failed, R.string.insufficient_space_for_download_shared_storage, new Object[0]);
                } else {
                    r5.A01(r7);
                }
            }
            r5.A01 = null;
        } else if (!r7.A02()) {
            A01(r7);
            this.A01 = null;
        }
    }
}
