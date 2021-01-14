package X;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;

/* renamed from: X.2mb  reason: invalid class name and case insensitive filesystem */
public class C58822mb implements AbstractC004502c {
    public final AnonymousClass0GE A00;

    public C58822mb(AnonymousClass0GE r1) {
        this.A00 = r1;
    }

    public void A00() {
        UserJid nullable;
        if (!(this instanceof C75083cB)) {
            this.A00.finish();
            return;
        }
        C75083cB r0 = (C75083cB) this;
        VoipActivityV2 voipActivityV2 = r0.A01;
        voipActivityV2.A0g();
        Intent intent = r0.A00;
        if (intent != null && (nullable = UserJid.getNullable(intent.getStringExtra("contact"))) != null) {
            VoipActivityV2.A07(voipActivityV2, nullable);
            VoipCallControlBottomSheet voipCallControlBottomSheet = voipActivityV2.A11;
            if (voipCallControlBottomSheet != null) {
                BottomSheetBehavior bottomSheetBehavior = voipCallControlBottomSheet.A09;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.A0D(3);
                    voipCallControlBottomSheet.A0H = true;
                }
                voipCallControlBottomSheet.A0T.A08(nullable);
            }
        }
    }

    public void A01(Intent intent) {
        if (!(this instanceof C75083cB)) {
            this.A00.setResult(-1, intent);
        } else {
            ((C75083cB) this).A00 = intent;
        }
    }

    @Override // X.AbstractC004502c
    public boolean AB1() {
        AnonymousClass0GE r0 = this.A00;
        if (r0 != null) {
            return C002001d.A3D(r0);
        }
        throw null;
    }

    @Override // X.AbstractC004502c
    public void AMi() {
        this.A00.AMi();
    }

    @Override // X.AbstractC004502c
    public void APl(DialogFragment dialogFragment, String str) {
        this.A00.APl(dialogFragment, str);
    }

    @Override // X.AbstractC004502c
    public void APm(DialogFragment dialogFragment) {
        this.A00.APm(dialogFragment);
    }

    @Override // X.AbstractC004502c
    public void APo(int i) {
        this.A00.APo(i);
    }

    @Override // X.AbstractC004502c
    public void APp(int i, int i2, int i3, C42921xV r10, Object... objArr) {
        this.A00.APp(i, i2, i3, r10, objArr);
    }

    @Override // X.AbstractC004502c
    public void APq(int i, int i2, Object... objArr) {
        this.A00.APq(i, i2, objArr);
    }

    @Override // X.AbstractC004502c
    public void APr(String str) {
        this.A00.APr(str);
    }

    @Override // X.AbstractC004502c
    public void APv(int i, int i2) {
        this.A00.APv(i, i2);
    }

    @Override // X.AbstractC004502c
    public void AQu(String str) {
        this.A00.AQu(str);
    }
}
