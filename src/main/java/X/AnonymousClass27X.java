package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import com.whatsapp.Main;
import com.whatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.27X  reason: invalid class name */
public class AnonymousClass27X extends C39951sN {
    public HandlerC07150Wc A00;
    public final AnonymousClass0JQ A01 = AnonymousClass0JQ.A00();
    public final AnonymousClass0IY A02 = AnonymousClass0IY.A00();
    public final AnonymousClass1Pw A03 = AnonymousClass1Pw.A00();
    public final AnonymousClass03R A04 = AnonymousClass03R.A00();
    public final C014708f A05 = C014708f.A00();

    @Override // X.C39951sN
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = new HandlerC07150Wc(Looper.getMainLooper(), this.A01, this.A02);
        this.A03.A01(this);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.C39951sN
    public void onPause() {
        super.onPause();
        if (this.A00.hasMessages(0)) {
            this.A00.removeMessages(0);
        }
        this.A01.A01();
    }

    @Override // X.C39951sN
    public void onResume() {
        super.onResume();
        this.A00.sendEmptyMessageDelayed(0, 3000);
        C014708f r2 = this.A05;
        if (!r2.A02() && r2.A01() != 2) {
            StringBuilder A0S = AnonymousClass008.A0S("settings/resume/wrong-state ");
            A0S.append(r2.A01());
            Log.i(A0S.toString());
            startActivity(new Intent(this, Main.class));
            finish();
        }
        if (Build.VERSION.SDK_INT < 23 || !this.A03.A06()) {
            this.A03.A02(false);
            return;
        }
        Intent A042 = AppAuthenticationActivity.A04(this);
        if (!this.A08) {
            super.A04 = A042;
            this.A06 = 202;
        } else {
            startActivityForResult(A042, 202);
        }
        overridePendingTransition(0, 0);
    }
}
