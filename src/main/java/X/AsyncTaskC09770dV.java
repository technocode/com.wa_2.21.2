package X;

import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import com.whatsapp.Conversation;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.conversationrow.ContactSyncActivity;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0dV  reason: invalid class name and case insensitive filesystem */
public final class AsyncTaskC09770dV extends AsyncTask {
    public final AnonymousClass0JW A00;

    public AsyncTaskC09770dV(AnonymousClass0JW r1) {
        this.A00 = r1;
    }

    public void A00(Object... objArr) {
        publishProgress(objArr);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object... objArr) {
        return this.A00.A02(objArr);
    }

    public void onCancelled() {
        Conversation conversation;
        AnonymousClass0JW r4 = this.A00;
        if (r4 instanceof C71793Qi) {
            C71793Qi r42 = (C71793Qi) r4;
            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = r42.A02;
            AnonymousClass33O r0 = stickerStorePackPreviewActivity.A0G;
            if (r0 != null) {
                int i = r42.A00;
                SparseBooleanArray sparseBooleanArray = r0.A01;
                if (sparseBooleanArray != null) {
                    sparseBooleanArray.put(i, false);
                }
            }
            AnonymousClass3QO r1 = stickerStorePackPreviewActivity.A0H;
            if (r1 != null) {
                r1.A02(r42.A00);
            }
        } else if (r4 instanceof C09890dh) {
            VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) ((C09890dh) r4).A0A.get();
            if (verifyTwoFactorAuth != null) {
                verifyTwoFactorAuth.A07.setEnabled(true);
                verifyTwoFactorAuth.A05.setProgress(100);
            }
        } else if (r4 instanceof C09940dm) {
            AnonymousClass0HU r12 = (AnonymousClass0HU) ((C09940dm) r4).A09.get();
            if (r12 != null) {
                C002001d.A2N(r12, 9);
                r12.A00 = null;
            }
        } else if (r4 instanceof C10310eQ) {
            ((C10310eQ) r4).A01.AMi();
        } else if (r4 instanceof C54702fM) {
            C54702fM r43 = (C54702fM) r4;
            r43.A00.A00(r43.A01.A01);
        } else if (r4 instanceof C52172ah) {
            ContactSyncActivity contactSyncActivity = (ContactSyncActivity) ((C52172ah) r4).A01;
            contactSyncActivity.A00 = null;
            contactSyncActivity.A0K.A00();
        } else if (r4 instanceof C51602Zj) {
            C51602Zj r44 = (C51602Zj) r4;
            r44.A01.A00(r44.A00);
        } else if (r4 instanceof C10940fS) {
            ContactPickerFragment contactPickerFragment = (ContactPickerFragment) ((C10940fS) r4).A05.get();
            if (contactPickerFragment != null && contactPickerFragment.A0U()) {
                Log.i("contactpicker/existencecheck/canceled");
                contactPickerFragment.A0K = null;
                contactPickerFragment.A0H.AMi();
            }
        } else if (r4 instanceof AnonymousClass2X6) {
            ((AnonymousClass2X6) r4).A00.A01();
        } else if (r4 instanceof AnonymousClass2X5) {
            ((AnonymousClass2X5) r4).A00.A01();
        } else if (r4 instanceof C40451tI) {
            C40451tI r45 = (C40451tI) r4;
            File A002 = C40451tI.A00(r45.A04.A00, r45);
            if (A002.exists()) {
                A002.delete();
            }
        } else if ((r4 instanceof C39851sD) && (conversation = (Conversation) ((C39851sD) r4).A07.get()) != null) {
            conversation.A0i = null;
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled(Object obj) {
        AnonymousClass0JW r2 = this.A00;
        if (r2 instanceof AnonymousClass3QS) {
            ((AnonymousClass3QS) r2).A04((AnonymousClass338) obj);
        } else if (r2 instanceof C10310eQ) {
            ((C10310eQ) r2).A01.AMi();
        } else if (r2 instanceof AbstractC10420eb) {
            AnonymousClass008.A1S(AnonymousClass008.A0S("gif/cache/loading onCanceled "), ((AbstractC10420eb) r2).A06);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        this.A00.A03(obj);
    }

    public void onPreExecute() {
        this.A00.A01();
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Object... objArr) {
        this.A00.A00(objArr);
    }
}
