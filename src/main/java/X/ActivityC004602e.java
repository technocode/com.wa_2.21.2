package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.BlockingUserInteractionActivity;
import com.whatsapp.InsufficientStorageSpaceActivity;
import com.whatsapp.TosUpdateActivity;
import com.whatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.List;

/* renamed from: X.02e  reason: invalid class name and case insensitive filesystem */
public class ActivityC004602e extends ActivityC004702f {
    public HandlerC07150Wc A00;
    public boolean A01;
    public boolean A02 = true;
    public boolean A03 = true;
    public final C02780Dk A04 = C02780Dk.A02();
    public final C06180Sc A05 = C06180Sc.A00();
    public final AnonymousClass0JQ A06 = AnonymousClass0JQ.A00();
    public final AnonymousClass0IY A07 = AnonymousClass0IY.A00();
    public final C03170Fb A08 = C03170Fb.A00();
    public final C06210Sf A09 = C06210Sf.A00();
    public final AnonymousClass1Pw A0A = AnonymousClass1Pw.A00();
    public final AnonymousClass03R A0B = AnonymousClass03R.A00();
    public final AnonymousClass00S A0C = AnonymousClass00S.A00();
    public final C02290Bk A0D = C02290Bk.A02();
    public final AnonymousClass0PB A0E = AnonymousClass0PB.A00();
    public final AnonymousClass3Ot A0F = AnonymousClass3Ot.A00();
    public final AbstractC29211Xn A0G = AbstractC29211Xn.A00();
    public final C06170Sb A0H = C06170Sb.A00();

    public void A0R() {
        if (this.A03) {
            if (this.A08.A06()) {
                startActivity(new Intent(this, TosUpdateActivity.class));
            }
            if (super.A0G == null) {
                throw null;
            }
        }
    }

    public void A0S(List list) {
        if (list.size() == 1) {
            if (AnonymousClass1VY.A0b((Jid) list.get(0))) {
                super.A0F.A06(R.string.sending_status, 1);
            } else {
                super.A0F.A06(R.string.sending_message, 1);
            }
        } else if (list.contains(C12060hU.A00)) {
            super.A0F.A06(R.string.sending_messages_and_status, 1);
        } else {
            super.A0F.A06(R.string.sending_messages, 1);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        if (getApplicationContext().getResources().getConfiguration().fontScale != getResources().getConfiguration().fontScale) {
            getResources().getConfiguration().fontScale = getApplicationContext().getResources().getConfiguration().fontScale;
            getResources().updateConfiguration(getResources().getConfiguration(), getResources().getDisplayMetrics());
        }
        super.onCreate(bundle);
        this.A00 = new HandlerC07150Wc(Looper.getMainLooper(), this.A06, this.A07);
        C06090Rr r2 = this.A0K;
        if (r2 != null) {
            if (C06090Rr.A02) {
                AnonymousClass0LW A042 = r2.A01.A04();
                r2.A00 = (DialogFragment) A042.A0Q.A01(C06090Rr.A03);
            }
            this.A0A.A01(this);
            return;
        }
        throw null;
    }

    public Dialog onCreateDialog(int i) {
        if (i == 122) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(((AnonymousClass2C0) this).A01.A06(R.string.register_connecting));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i != 123) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass0MB r3 = new AnonymousClass0MB(this);
            AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
            r3.A01.A0E = r2.A06(R.string.settings_network_service_unavailable);
            r3.A07(r2.A06(R.string.ok_short), new AnonymousClass1K8(this));
            return r3.A00();
        }
    }

    @Override // X.ActivityC004802g
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 82 || !this.A01) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.A01 = true;
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.A01 = false;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        if (this.A00.hasMessages(0)) {
            this.A00.removeMessages(0);
        }
        this.A06.A01();
    }

    @Override // X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        boolean z;
        super.onResume();
        if (this.A02) {
            this.A00.sendEmptyMessageDelayed(0, 3000);
        }
        if (!(this instanceof VoipActivityV2)) {
            z = this.A0A.A04();
        } else {
            z = false;
        }
        if (z) {
            AnonymousClass1Pw r1 = this.A0A;
            if (r1.A06()) {
                A0H(AppAuthenticationActivity.A04(this), 202);
                overridePendingTransition(0, 0);
                return;
            }
            r1.A02(false);
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        this.A08.A02();
        A0R();
        if (Boolean.TRUE.equals(this.A0D.A01.A01())) {
            Intent intent = getIntent();
            Intent intent2 = new Intent(this, BlockingUserInteractionActivity.class);
            intent2.putExtra("original_intent", intent);
            intent2.putExtra("blocking_type", 0);
            finish();
            startActivity(intent2);
        }
        if (!(this instanceof InsufficientStorageSpaceActivity)) {
            AnonymousClass0PB r2 = this.A0E;
            if (r2.A01() == 1 || r2.A01() == 4 || r2.A01() == 3) {
                Intent intent3 = getIntent();
                Intent intent4 = new Intent(this, BlockingUserInteractionActivity.class);
                intent4.putExtra("original_intent", intent3);
                intent4.putExtra("blocking_type", 1);
                finish();
                startActivity(intent4);
            } else if (r2.A01() == 0) {
                r2.A00.A03(this, new C08880bu(this));
            }
        }
    }
}
