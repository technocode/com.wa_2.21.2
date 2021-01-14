package com.whatsapp;

import X.AbstractC07640Yw;
import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass08B;
import X.AnonymousClass0AR;
import X.AnonymousClass0BP;
import X.AnonymousClass0MB;
import X.AnonymousClass1J3;
import X.AnonymousClass1J4;
import X.AnonymousClass1NZ;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C03490Gl;
import X.C39001qn;
import X.C39011qo;
import X.C39021qp;
import X.C40591tW;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.search.verification.client.R;
import com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class SetStatus extends ActivityC004602e implements AbstractC07640Yw {
    public static ArrayList A0A;
    public View A00;
    public AnonymousClass1NZ A01;
    public TextEmojiLabel A02;
    public boolean A03;
    public final Handler A04 = new Handler(Looper.getMainLooper(), new AnonymousClass1J4(this));
    public final AnonymousClass01I A05 = AnonymousClass01I.A00();
    public final C03490Gl A06 = C03490Gl.A00();
    public final AnonymousClass0BP A07 = new C40591tW(this);
    public final AnonymousClass08B A08 = AnonymousClass08B.A00;
    public final AnonymousClass0AR A09 = AnonymousClass0AR.A00();

    @Override // X.AbstractC07640Yw
    public void ADZ(String str) {
    }

    public final void A0T() {
        APm(EmojiEditTextBottomSheetDialogFragment.A00(4, R.string.add_info, R.string.no_empty_info, this.A06.A01(), 139, null, 16385));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U() {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SetStatus.A0U():void");
    }

    public void A0V(String str) {
        if (!A0Q(R.string.about_update_no_network)) {
            C002001d.A2O(this, 2);
            if (!this.A09.A0U(str, new C39011qo(this), new C39021qp(this), new C39001qn(this), null)) {
                Handler handler = this.A04;
                handler.removeMessages(0);
                handler.sendEmptyMessage(0);
            }
            this.A04.sendEmptyMessageDelayed(0, 32000);
        }
    }

    @Override // X.AbstractC07640Yw
    public void AFQ(int i, String str) {
        if (i == 4 && str.length() > 0 && !str.equals(this.A02.getText().toString())) {
            this.A00.setOnClickListener(null);
            StringBuilder sb = new StringBuilder("status/change ");
            sb.append(str);
            Log.d(sb.toString());
            A0V(str);
        }
    }

    public /* synthetic */ void lambda$onCreate$1328$SetStatus(View view) {
        A0T();
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
        if (menuItem.getItemId() != 1) {
            return true;
        }
        A0A.remove(adapterContextMenuInfo.position);
        this.A01.notifyDataSetChanged();
        A0U();
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0091, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SetStatus.onCreate(android.os.Bundle):void");
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 1, 0, ((AnonymousClass2C0) this).A01.A06(R.string.delete_info));
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 0) {
            AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
            return ProgressDialog.show(this, r2.A06(R.string.info_update_dialog_title), r2.A06(R.string.info_update_dialog_message), true, false);
        } else if (i == 1) {
            AnonymousClass01X r22 = ((AnonymousClass2C0) this).A01;
            return ProgressDialog.show(this, r22.A06(R.string.info_retrieve_dialog_title), r22.A06(R.string.info_retrieve_dialog_message), true, false);
        } else if (i == 2) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(((AnonymousClass2C0) this).A01.A06(R.string.info_update_dialog_title));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i != 3) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass0MB r3 = new AnonymousClass0MB(this);
            AnonymousClass01X r23 = ((AnonymousClass2C0) this).A01;
            r3.A01.A0E = r23.A06(R.string.delete_all_confirm);
            r3.A07(r23.A06(R.string.delete_all), new AnonymousClass1J3(this));
            return AnonymousClass008.A03(r23, R.string.cancel, r3);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, ((AnonymousClass2C0) this).A01.A06(R.string.delete_all));
        return true;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A08.A00(this.A07);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            finish();
            return true;
        } else if (A0A.size() == 0) {
            APo(R.string.no_info_to_delete);
            return true;
        } else {
            C002001d.A2O(this, 3);
            return true;
        }
    }
}
