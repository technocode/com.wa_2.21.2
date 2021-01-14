package X;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.07p  reason: invalid class name and case insensitive filesystem */
public class C013307p implements AbstractC007403p {
    public final String A00;
    public final HashMap A01 = new HashMap();

    public C013307p(String str) {
        this.A00 = str;
    }

    @Override // X.AbstractC007403p
    public File A6R(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.A01.get(decode);
        if (file != null) {
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                StringBuilder sb = new StringBuilder("Failed to resolve canonical path for ");
                sb.append(file2);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException(AnonymousClass008.A0J("Unable to find configured root for ", uri));
        }
    }

    @Override // X.AbstractC007403p
    public Uri A9b(File file) {
        String substring;
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : this.A01.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                boolean endsWith = path2.endsWith("/");
                int length = path2.length();
                if (endsWith) {
                    substring = canonicalPath.substring(length);
                } else {
                    substring = canonicalPath.substring(length + 1);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Uri.encode((String) entry.getKey()));
                sb.append('/');
                sb.append(Uri.encode(substring, "/"));
                return new Uri.Builder().scheme("content").authority(this.A00).encodedPath(sb.toString()).build();
            }
            throw new IllegalArgumentException(AnonymousClass008.A0K("Failed to find configured root that contains ", canonicalPath));
        } catch (IOException unused) {
            StringBuilder sb2 = new StringBuilder("Failed to resolve canonical path for ");
            sb2.append(file);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
