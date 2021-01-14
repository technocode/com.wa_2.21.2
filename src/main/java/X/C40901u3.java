package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import com.whatsapp.TextStatusComposerActivity;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.1u3  reason: invalid class name and case insensitive filesystem */
public class C40901u3 implements AbstractC02970Eh {
    public final /* synthetic */ ViewOnClickCListenerShape4S0200000_I1 A00;

    @Override // X.AbstractC02970Eh
    public void AFt(Exception exc) {
    }

    public C40901u3(ViewOnClickCListenerShape4S0200000_I1 viewOnClickCListenerShape4S0200000_I1) {
        this.A00 = viewOnClickCListenerShape4S0200000_I1;
    }

    @Override // X.AbstractC02970Eh
    public void AG3(String str, File file, byte[] bArr) {
        ViewOnClickCListenerShape4S0200000_I1 viewOnClickCListenerShape4S0200000_I1 = this.A00;
        TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) viewOnClickCListenerShape4S0200000_I1.A00;
        textStatusComposerActivity.A0B.setProgressBarVisibility(false);
        ((View) viewOnClickCListenerShape4S0200000_I1.A01).setVisibility(0);
        if (file == null) {
            Log.e("textstatus/gif-preview/file is null");
        } else if (textStatusComposerActivity != null) {
            Uri fromFile = Uri.fromFile(new File(file.getAbsolutePath()));
            ArrayList arrayList = new ArrayList();
            arrayList.add(fromFile);
            String A1l = C002001d.A1l(textStatusComposerActivity.A08.getStringText());
            AnonymousClass2PG r1 = new AnonymousClass2PG(fromFile);
            r1.A0A(A1l);
            r1.A09((byte) 13);
            C08340aw r2 = new C08340aw(r1);
            String rawString = C12060hU.A00.getRawString();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Bundle bundle = new Bundle();
            r2.A02(bundle);
            Intent intent = new Intent(textStatusComposerActivity, MediaPreviewActivity.class);
            intent.putExtra("android.intent.extra.STREAM", arrayList);
            intent.putExtra("android.intent.extra.TEXT", (String) null);
            intent.putExtra("jid", rawString);
            intent.putExtra("jids", (Serializable) null);
            intent.putExtra("max_items", 0);
            intent.putExtra("origin", 9);
            intent.putExtra("picker_open_time", elapsedRealtime);
            intent.putExtra("send", true);
            intent.putExtra("quoted_message_row_id", 0L);
            intent.putExtra("quoted_group_jid", (String) null);
            intent.putExtra("number_from_url", false);
            intent.putExtra("media_preview_params", bundle);
            intent.putExtra("smb_quick_reply", false);
            intent.putExtra("start_home", false);
            intent.putExtra("animate_uri", (Parcelable) null);
            intent.putExtra("preselected_image_uri", (Parcelable) null);
            intent.putExtra("scan_for_qr", false);
            textStatusComposerActivity.A0H(intent, 1);
        } else {
            throw null;
        }
    }
}
