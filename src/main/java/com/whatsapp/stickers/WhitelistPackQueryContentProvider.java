package com.whatsapp.stickers;

import X.AnonymousClass008;
import X.AnonymousClass0H9;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;

public class WhitelistPackQueryContentProvider extends ContentProvider {
    public UriMatcher A00;
    public AnonymousClass0H9 A01;

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri) {
        return AnonymousClass008.A0M("vnd.android.cursor.item/vnd.", "com.whatsapp.provider.sticker_whitelist_check", ".", "is_whitelisted");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public boolean onCreate() {
        Log.d("WhitelistPackQueryContentProvider/onCreate");
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        UriMatcher uriMatcher;
        ProviderInfo resolveContentProvider;
        String str3;
        if (this.A01 == null) {
            this.A01 = AnonymousClass0H9.A00();
        }
        try {
            synchronized (this) {
                i = 1;
                if (this.A00 == null) {
                    UriMatcher uriMatcher2 = new UriMatcher(-1);
                    this.A00 = uriMatcher2;
                    uriMatcher2.addURI("com.whatsapp.provider.sticker_whitelist_check", "is_whitelisted", 1);
                }
                uriMatcher = this.A00;
            }
            if (uriMatcher.match(uri) == 1 && getContext() != null) {
                PackageManager packageManager = getContext().getPackageManager();
                String queryParameter = uri.getQueryParameter("authority");
                String queryParameter2 = uri.getQueryParameter("identifier");
                if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2) || (resolveContentProvider = packageManager.resolveContentProvider(queryParameter, 128)) == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    str3 = getCallingPackage();
                } else {
                    str3 = packageManager.getNameForUid(Binder.getCallingUid());
                }
                if (str3 == null || !str3.equals(resolveContentProvider.packageName)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("the calling package ");
                    sb.append(str3);
                    sb.append(" does not own the queried authority: ");
                    sb.append(queryParameter);
                    Log.w(sb.toString());
                } else {
                    MatrixCursor matrixCursor = new MatrixCursor(new String[]{"result"});
                    MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
                    if (!this.A01.A03(queryParameter, queryParameter2)) {
                        i = 0;
                    }
                    newRow.add(Integer.valueOf(i));
                    return matrixCursor;
                }
            }
            return null;
        } catch (Exception e) {
            Log.e("Exception when querying whitelist packs", e);
            return null;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
