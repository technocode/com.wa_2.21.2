package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

/* renamed from: X.1ro  reason: invalid class name and case insensitive filesystem */
public class C39611ro implements AbstractC02970Eh {
    public final /* synthetic */ C39621rp A00;

    public C39611ro(C39621rp r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC02970Eh
    public void AFt(Exception exc) {
        C39621rp r2 = this.A00;
        Conversation conversation = r2.A01;
        conversation.A0t.setProgressBarVisibility(false);
        r2.A00.setVisibility(0);
        if (exc instanceof IOException) {
            AnonymousClass02M r22 = ((ActivityC004702f) conversation).A0F;
            r22.A0D(r22.A04.A00.getString(R.string.generic_network_error_retry_later), 0);
        }
    }

    @Override // X.AbstractC02970Eh
    public void AG3(String str, File file, byte[] bArr) {
        C39621rp r2 = this.A00;
        Conversation conversation = r2.A01;
        conversation.A0t.setProgressBarVisibility(false);
        r2.A00.setVisibility(0);
        if (file == null) {
            Log.e("conversation/gif-preview/file is null");
        } else {
            conversation.A0H(GifHelper.A00(file, conversation, conversation.A0k, Collections.singletonList(conversation.A14), conversation.A17), 27);
        }
    }
}
