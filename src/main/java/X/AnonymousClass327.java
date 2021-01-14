package X;

import android.net.SSLSessionCache;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* renamed from: X.327  reason: invalid class name */
public class AnonymousClass327 {
    public static boolean A00;

    public static void A00(SSLContext sSLContext, SSLSessionCache sSLSessionCache) {
        if (sSLContext.getClientSessionContext() == null) {
            Log.w("SSLSessionCacheHack/session context is null");
        } else if (!sSLContext.getClientSessionContext().getClass().getSimpleName().equals("ClientSessionContext")) {
            StringBuilder A0S = AnonymousClass008.A0S("SSLSessionCacheHack/session context does not match, class=");
            A0S.append(sSLContext.getClientSessionContext().getClass().getName());
            Log.w(A0S.toString());
        } else {
            try {
                Field declaredField = sSLSessionCache.getClass().getDeclaredField("mSessionCache");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(sSLSessionCache);
                Class<?> cls = Class.forName("com.android.org.conscrypt.SSLClientSessionCache");
                sSLContext.getClientSessionContext().getClass().getMethod("setPersistentCache", cls).invoke(sSLContext.getClientSessionContext(), obj);
            } catch (ClassNotFoundException e) {
                e.toString();
            } catch (Exception e2) {
                StringBuilder A0S2 = AnonymousClass008.A0S("SSLSessionCacheHack:");
                A0S2.append(e2.toString());
                Log.e(A0S2.toString());
            }
        }
    }

    public static void A01(SSLContext sSLContext, SSLSessionCache sSLSessionCache, String str, int i) {
        Field field;
        Field field2;
        if (!A00 && sSLContext != null && sSLSessionCache != null) {
            try {
                Field declaredField = sSLSessionCache.getClass().getDeclaredField("mSessionCache");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(sSLSessionCache);
                Method method = obj.getClass().getMethod("getSessionData", String.class, Integer.TYPE);
                Integer valueOf = Integer.valueOf(i);
                byte[] bArr = (byte[]) method.invoke(obj, str, valueOf);
                if (bArr != null) {
                    Method declaredMethod = sSLContext.getClientSessionContext().getClass().getSuperclass().getDeclaredMethod("toSession", byte[].class, String.class, Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    SSLSession sSLSession = (SSLSession) declaredMethod.invoke(sSLContext.getClientSessionContext(), bArr, str, valueOf);
                    if (sSLSession != null) {
                        A02(sSLSession);
                    }
                }
            } catch (Exception e) {
                StringBuilder A0S = AnonymousClass008.A0S("SSLSessionCacheHack:");
                A0S.append(e.toString());
                Log.i(A0S.toString());
                A00 = true;
            }
            try {
                sSLSessionCache.getClass().getDeclaredField("mSessionCache").setAccessible(true);
                Method method2 = sSLContext.getClientSessionContext().getClass().getMethod("getSession", String.class, Integer.TYPE);
                SSLSessionContext clientSessionContext = sSLContext.getClientSessionContext();
                Integer valueOf2 = Integer.valueOf(i);
                SSLSession sSLSession2 = (SSLSession) method2.invoke(clientSessionContext, str, valueOf2);
                sSLContext.getClientSessionContext().getSessionTimeout();
                if (sSLSession2 != null) {
                    A02(sSLSession2);
                }
                try {
                    field = sSLContext.getClass().getDeclaredField("contextSpi");
                } catch (NoSuchFieldException unused) {
                    field = sSLContext.getClass().getDeclaredField("spiImpl");
                }
                if (field == null) {
                    A00 = true;
                    return;
                }
                field.setAccessible(true);
                Object obj2 = field.get(sSLContext);
                if (obj2 != null) {
                    try {
                        field2 = obj2.getClass().getSuperclass().getDeclaredField("sslParameters");
                    } catch (NoSuchFieldException unused2) {
                        field2 = obj2.getClass().getDeclaredField("sslParameters");
                    }
                    field2.setAccessible(true);
                    Object obj3 = field2.get(obj2);
                    try {
                        Method declaredMethod2 = obj3.getClass().getDeclaredMethod("getCachedClientSession", sSLContext.getClientSessionContext().getClass(), String.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(obj3, sSLContext.getClientSessionContext(), str, valueOf2);
                    } catch (NoSuchMethodException unused3) {
                        A00 = true;
                    }
                }
            } catch (Exception e2) {
                StringBuilder A0S2 = AnonymousClass008.A0S("SSLSessionCacheHack:");
                A0S2.append(e2.toString());
                Log.w(A0S2.toString());
                A00 = true;
            }
        }
    }

    public static void A02(SSLSession sSLSession) {
        long j;
        try {
            j = (long) sSLSession.getPeerCertificates().length;
        } catch (SSLPeerUnverifiedException e) {
            Log.e(e);
            j = -1;
        }
        StringBuilder A0S = AnonymousClass008.A0S("age=");
        A0S.append((System.currentTimeMillis() - sSLSession.getCreationTime()) / 1000);
        A0S.append(", creation=");
        A0S.append(sSLSession.getCreationTime());
        A0S.append(", protocol=");
        A0S.append(sSLSession.getProtocol());
        A0S.append(", valid=");
        A0S.append(sSLSession.isValid());
        A0S.append(", peerCertificateCount=");
        A0S.append(j);
        A0S.toString();
    }
}
