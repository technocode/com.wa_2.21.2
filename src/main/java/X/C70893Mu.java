package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;

/* renamed from: X.3Mu  reason: invalid class name and case insensitive filesystem */
public class C70893Mu extends AnonymousClass0SD {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final AbstractC02280Bj A01;
    public final AnonymousClass0Yj A02 = new AnonymousClass0Yj();
    public final C02270Bi A03 = new C02270Bi();
    public final C02270Bi A04;
    public final AnonymousClass00D A05;
    public final C014508d A06;
    public final AnonymousClass0FV A07;
    public final C70883Mt A08 = new C70883Mt(this);
    public final AnonymousClass3ZI A09;
    public final AnonymousClass0FW A0A;
    public final AnonymousClass0FY A0B;
    public final Runnable A0C = new RunnableEBaseShape12S0100000_I1_7(this, 30);

    public C70893Mu(AnonymousClass02M r40, AnonymousClass01I r41, AnonymousClass00T r42, AnonymousClass0DG r43, AnonymousClass0AR r44, C000300f r45, AnonymousClass09E r46, AnonymousClass01J r47, AnonymousClass01A r48, AnonymousClass0EP r49, C03160Fa r50, AnonymousClass01X r51, AnonymousClass0BD r52, AnonymousClass0IX r53, AnonymousClass0EO r54, AnonymousClass0BZ r55, AnonymousClass02J r56, AnonymousClass0BB r57, AnonymousClass00C r58, AnonymousClass0HN r59, C02290Bk r60, AnonymousClass0FZ r61, C014508d r62, AnonymousClass0HM r63, AnonymousClass00D r64, C016608y r65, C06310Ss r66, AnonymousClass0FV r67, AnonymousClass321 r68, AnonymousClass0FY r69, AnonymousClass0GW r70, AnonymousClass01T r71, AnonymousClass0I6 r72, AnonymousClass0BE r73, AnonymousClass0FW r74, AnonymousClass094 r75, AnonymousClass0PB r76) {
        this.A06 = r62;
        this.A05 = r64;
        this.A07 = r67;
        this.A0A = r74;
        this.A0B = r69;
        AnonymousClass3ZI r4 = new AnonymousClass3ZI(this, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r63, r65, r66, r67, r68, r70, r71, r72, r73, r75, r76);
        this.A09 = r4;
        C02270Bi r2 = ((AbstractC07180Wf) r4).A00;
        this.A01 = r2;
        this.A02.A09(r2, new C70843Mp(this));
        AnonymousClass0Yj r22 = this.A02;
        r22.A09(this.A03, new C70873Ms(r22));
        this.A04 = new C02270Bi();
        r69.A01(this.A08);
        A02();
    }

    public final void A02() {
        C014508d r0 = this.A06;
        r0.A05();
        if (r0.A01) {
            Log.i("DirectTransferBackgroundTaskViewModel/msg-store-is-already-ready");
            A06(this.A05.A00.getInt("migrate_from_other_app_attempt_count", 0), 2);
            A05(6);
            return;
        }
        SharedPreferences sharedPreferences = this.A05.A00;
        sharedPreferences.edit().putInt("migrate_from_other_app_attempt_count", sharedPreferences.getInt("migrate_from_other_app_attempt_count", 0) + 1).apply();
        A04();
        Integer num = 1;
        if (!num.equals(this.A03.A01())) {
            Log.i("DirectTransferBackgroundTaskViewModel/startBackgroundTaskAfterOtherAppIsLoggedOut/start-background-task");
            A05(1);
            this.A09.A00();
        }
    }

    public final void A03() {
        Log.i("DirectTransferBackgroundTaskViewModel/removeAllListener");
        this.A00.removeCallbacks(this.A0C);
    }

    public final void A04() {
        int i = this.A05.A00.getInt("direct_db_migration_timeout_in_secs", 180);
        long j = ((long) i) * 1000;
        AnonymousClass008.A1P(AnonymousClass008.A0S("DirectTransferBackgroundTaskViewModel/setupTimeout/timeout ="), j);
        if (i > 0) {
            this.A00.postDelayed(this.A0C, j);
        }
    }

    public final void A05(int i) {
        switch (i) {
            case 1:
            case 2:
            case 7:
                this.A03.A08(Integer.valueOf(i));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                if (this.A05.A00.getInt("migrate_from_other_app_attempt_count", 0) >= 3) {
                    A05(7);
                    return;
                } else {
                    this.A03.A08(Integer.valueOf(i));
                    return;
                }
            case 8:
                return;
            default:
                throw new IllegalArgumentException(AnonymousClass008.A0F("state is not supported, state  = ", i));
        }
    }

    public final void A06(int i, int i2) {
        if (i == 1) {
            this.A07.A01.A04 = Integer.valueOf(i2);
        } else if (i == 2) {
            this.A07.A01.A07 = Integer.valueOf(i2);
        } else if (i == 3) {
            this.A07.A01.A08 = Integer.valueOf(i2);
        }
        if (this.A07 == null) {
            throw null;
        }
    }
}
