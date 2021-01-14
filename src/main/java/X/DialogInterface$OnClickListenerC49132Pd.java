package X;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.gif_search.StarDownloadableGifDialogFragment;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.2Pd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC49132Pd implements DialogInterface.OnClickListener {
    public final /* synthetic */ StarDownloadableGifDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC49132Pd(StarDownloadableGifDialogFragment starDownloadableGifDialogFragment) {
        this.A00 = starDownloadableGifDialogFragment;
    }

    /* JADX INFO: finally extract failed */
    public final void onClick(DialogInterface dialogInterface, int i) {
        StarDownloadableGifDialogFragment starDownloadableGifDialogFragment = this.A00;
        if (i == -1) {
            C49182Pi r3 = starDownloadableGifDialogFragment.A03;
            C49262Ps r7 = starDownloadableGifDialogFragment.A00;
            long A05 = starDownloadableGifDialogFragment.A01.A05();
            AnonymousClass02M r2 = r3.A00;
            r2.A02.post(new RunnableEBaseShape9S0100000_I1_4(r3, 49));
            C49172Ph r0 = r3.A01;
            ReentrantReadWriteLock.ReadLock readLock = r0.A01;
            readLock.lock();
            try {
                AnonymousClass0BK A01 = r0.A00.A01();
                SQLiteDatabase sQLiteDatabase = A01.A00;
                sQLiteDatabase.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("gif_id", r7.A04);
                    C49252Pr r6 = r7.A03;
                    contentValues.put("static_url", r6.A02);
                    contentValues.put("static_height", Integer.valueOf(r6.A00));
                    contentValues.put("static_width", Integer.valueOf(r6.A01));
                    C49252Pr r62 = r7.A02;
                    contentValues.put("preview_url", r62.A02);
                    contentValues.put("preview_height", Integer.valueOf(r62.A00));
                    contentValues.put("preview_width", Integer.valueOf(r62.A01));
                    C49252Pr r63 = r7.A01;
                    contentValues.put("content_url", r63.A02);
                    contentValues.put("content_height", Integer.valueOf(r63.A00));
                    contentValues.put("content_width", Integer.valueOf(r63.A01));
                    contentValues.put("gif_attribution", Integer.valueOf(r7.A00));
                    contentValues.put("timestamp", Long.valueOf(A05));
                    A01.A0B("downloadable_gifs", contentValues, "addGifInfo/INSERT_DOWNLOADABLE_GIF");
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } finally {
                readLock.unlock();
            }
        }
    }
}
