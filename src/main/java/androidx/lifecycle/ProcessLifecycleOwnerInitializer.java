package androidx.lifecycle;

import X.AnonymousClass082;
import X.AnonymousClass083;
import X.C013407r;
import X.C013507s;
import X.C013707u;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;

public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (!C013407r.A00.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C013507s());
        }
        Context context2 = getContext();
        C013707u r2 = C013707u.A08;
        r2.A02 = new Handler();
        r2.A07.A04(AnonymousClass082.ON_CREATE);
        ((Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new AnonymousClass083(r2));
        return true;
    }
}
