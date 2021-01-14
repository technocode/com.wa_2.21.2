package X;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2KT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2KT implements DatabaseErrorHandler {
    public final /* synthetic */ File A00;

    public /* synthetic */ AnonymousClass2KT(File file) {
        this.A00 = file;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        File file = this.A00;
        StringBuilder sb = new StringBuilder("msgstore/integritycheck/error-handler/corrupt-db ");
        sb.append(file);
        Log.i(sb.toString());
    }
}
