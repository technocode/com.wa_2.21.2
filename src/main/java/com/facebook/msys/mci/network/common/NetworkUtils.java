package com.facebook.msys.mci.network.common;

import X.AnonymousClass04B;
import X.C33001g2;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;

public class NetworkUtils {
    public static native String getSandboxDomain();

    public static native synchronized void setSandboxDomain(String str);

    public static Map flattenHeaders(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    hashMap.put(entry.getKey(), ((List) entry.getValue()).get(0));
                } else if (list.size() > 1) {
                    StringBuilder sb = new StringBuilder(list.size() << 4);
                    for (int i = 1; i < list.size(); i++) {
                        sb.append(',');
                        sb.append((String) list.get(i));
                    }
                    hashMap.put(entry.getKey(), sb.toString());
                }
            }
        }
        return hashMap;
    }

    public static Map flattenHeaders(Header[] headerArr) {
        HashMap hashMap = new HashMap();
        for (Header header : headerArr) {
            hashMap.put(header.getName(), header.getValue());
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.String[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    public static Pair httpHeaderMapToKeysAndValues(Map map) {
        String[] strArr = new String[map.size()];
        String[] strArr2 = new String[map.size()];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            strArr[i] = entry.getKey();
            strArr2[i] = entry.getValue();
            i++;
        }
        return new Pair(strArr, strArr2);
    }

    public static void markDataTaskCompleted(DataTask dataTask, AnonymousClass04B r4, UrlResponse urlResponse, String str, byte[] bArr, File file, IOException iOException) {
        r4.executeInNetworkContext(new C33001g2(dataTask, r4, urlResponse, bArr, file, iOException));
    }

    public static UrlResponse newErrorURLResponse(UrlRequest urlRequest) {
        return new UrlResponse(urlRequest, 0, new HashMap());
    }
}
