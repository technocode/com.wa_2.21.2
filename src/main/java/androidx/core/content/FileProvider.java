package androidx.core.content;

import X.AbstractC007403p;
import X.AnonymousClass008;
import X.C004302a;
import X.C013307p;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    public static HashMap A01 = new HashMap();
    public static final File A02 = new File("/");
    public static final String[] A03 = {"_display_name", "_size"};
    public AbstractC007403p A00;

    public boolean onCreate() {
        return true;
    }

    public static AbstractC007403p A00(Context context, String str) {
        C013307p r3;
        File file;
        synchronized (A01) {
            AbstractC007403p r32 = (AbstractC007403p) A01.get(str);
            r3 = r32;
            if (r32 == null) {
                try {
                    C013307p r33 = new C013307p(str);
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                    if (resolveContentProvider != null) {
                        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                        if (loadXmlMetaData != null) {
                            while (true) {
                                int next = loadXmlMetaData.next();
                                if (next == 1) {
                                    A01.put(str, r33);
                                    r3 = r33;
                                    break;
                                } else if (next == 2) {
                                    String name = loadXmlMetaData.getName();
                                    String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                                    String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                                    if ("root-path".equals(name)) {
                                        file = A02;
                                    } else if ("files-path".equals(name)) {
                                        file = context.getFilesDir();
                                    } else if ("cache-path".equals(name)) {
                                        file = context.getCacheDir();
                                    } else if ("external-path".equals(name)) {
                                        file = Environment.getExternalStorageDirectory();
                                    } else if ("external-files-path".equals(name)) {
                                        File[] A09 = C004302a.A09(context);
                                        if (A09.length > 0) {
                                            file = A09[0];
                                        } else {
                                            continue;
                                        }
                                    } else if ("external-cache-path".equals(name)) {
                                        File[] A08 = C004302a.A08(context);
                                        if (A08.length > 0) {
                                            file = A08[0];
                                        } else {
                                            continue;
                                        }
                                    } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                                        File[] externalMediaDirs = context.getExternalMediaDirs();
                                        if (externalMediaDirs.length > 0) {
                                            file = externalMediaDirs[0];
                                        } else {
                                            continue;
                                        }
                                    }
                                    if (file == null) {
                                        continue;
                                    } else {
                                        String str2 = new String[]{attributeValue2}[0];
                                        if (str2 != null) {
                                            file = new File(file, str2);
                                        }
                                        if (!TextUtils.isEmpty(attributeValue)) {
                                            try {
                                                r33.A01.put(attributeValue, file.getCanonicalFile());
                                            } catch (IOException e) {
                                                StringBuilder sb = new StringBuilder("Failed to resolve canonical path for ");
                                                sb.append(file);
                                                throw new IllegalArgumentException(sb.toString(), e);
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Name must not be empty");
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                        }
                    } else {
                        throw new IllegalArgumentException(AnonymousClass008.A0K("Couldn't find meta-data for provider with authority ", str));
                    }
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                } catch (XmlPullParserException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return r3;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.A00 = A00(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.A00.A6R(uri).delete() ? 1 : 0;
    }

    public String getType(Uri uri) {
        String mimeTypeFromExtension;
        File A6R = this.A00.A6R(uri);
        int lastIndexOf = A6R.getName().lastIndexOf(46);
        return (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(A6R.getName().substring(lastIndexOf + 1))) == null) ? "application/octet-stream" : mimeTypeFromExtension;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File A6R = this.A00.A6R(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            throw new IllegalArgumentException(AnonymousClass008.A0K("Invalid mode: ", str));
        }
        return ParcelFileDescriptor.open(A6R, i);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File A6R = this.A00.A6R(uri);
        if (strArr == null) {
            strArr = A03;
        }
        int length = strArr.length;
        String[] strArr3 = new String[length];
        Object[] objArr = new Object[length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = A6R.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(A6R.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
