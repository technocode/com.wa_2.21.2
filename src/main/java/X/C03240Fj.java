package X;

import android.content.Context;
import com.whatsapp.dns.DnsCacheEntrySerializable;
import com.whatsapp.util.Log;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

/* renamed from: X.0Fj  reason: invalid class name and case insensitive filesystem */
public class C03240Fj {
    public static volatile C03240Fj A01;
    public final AnonymousClass00S A00;

    public C03240Fj(AnonymousClass00S r1) {
        this.A00 = r1;
    }

    public static C03240Fj A00() {
        if (A01 == null) {
            synchronized (C03240Fj.class) {
                if (A01 == null) {
                    A01 = new C03240Fj(AnonymousClass00S.A00());
                }
            }
        }
        return A01;
    }

    public synchronized void A01(Context context, String[] strArr) {
        ArrayList arrayList;
        AnonymousClass00E.A00();
        int length = strArr.length;
        if (length != 1 || !strArr[0].equalsIgnoreCase("CLEAR")) {
            if (length > 0) {
                if (length != 1 || !"CLEAR".equalsIgnoreCase(strArr[0])) {
                    arrayList = new ArrayList();
                    for (String str : strArr) {
                        if (str != null) {
                            String[] split = str.split("\\|", 6);
                            if (split.length != 6) {
                                AnonymousClass008.A17("DnsCacheEntrySerializable/parseFallbackIpString/", str);
                            } else {
                                try {
                                    InetAddress byName = InetAddress.getByName(split[0]);
                                    short parseShort = Short.parseShort(split[1]);
                                    long parseLong = Long.parseLong(split[2]);
                                    DnsCacheEntrySerializable dnsCacheEntrySerializable = new DnsCacheEntrySerializable(Long.valueOf((Long.parseLong(split[3]) + parseLong) * 1000), byName, Short.valueOf(parseShort), Boolean.parseBoolean(split[4]), Boolean.parseBoolean(split[5]));
                                    StringBuilder sb = new StringBuilder("FallbackManager/getDnsCacheEntrySerializables/good/");
                                    sb.append(dnsCacheEntrySerializable);
                                    Log.d(sb.toString());
                                    arrayList.add(dnsCacheEntrySerializable);
                                } catch (NumberFormatException | UnknownHostException e) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("DnsCacheEntrySerializable/parseFallbackIpString/");
                                    sb2.append(str);
                                    Log.e(sb2.toString(), e);
                                }
                            }
                        }
                        AnonymousClass008.A16("FallbackManager/getDnsCacheEntrySerializables/bad/", str);
                    }
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(context.openFileOutput("fbips", 0)));
                    objectOutputStream.writeObject(arrayList);
                    objectOutputStream.close();
                    return;
                }
            }
            arrayList = null;
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(context.openFileOutput("fbips", 0)));
                objectOutputStream2.writeObject(arrayList);
                objectOutputStream2.close();
            } catch (IOException e2) {
                Log.e("xmpp/service/fallback/saveFallbacks", e2);
            }
            return;
        }
        context.deleteFile("fbips");
    }
}
