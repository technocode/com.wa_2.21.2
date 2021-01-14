package X;

import com.whatsapp.net.tls13.WtCachedPsk;
import com.whatsapp.util.Log;
import com.whatsapp.watls13.WtPersistentSession;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.2VW  reason: invalid class name */
public abstract class AnonymousClass2VW {
    public void A00(AnonymousClass2VY r23, AnonymousClass2VX r24, C50562Ve r25, int i) {
        AnonymousClass3WH r2;
        long j;
        int intValue;
        C50632Vl r22;
        int intValue2;
        int intValue3;
        C50632Vl r8;
        String str;
        if (this instanceof C58352lm) {
            C58382lp r0 = (C58382lp) r24;
            r0.A0C.A02 = System.currentTimeMillis();
            try {
                r0.A0D.A00((byte[]) r23.A00);
            } catch (C29001Wo e) {
                throw new C58162lT("Failed to update transcripts.", r23, r0, r25, i, e);
            }
        } else if (this instanceof C58342ll) {
            C58382lp r02 = (C58382lp) r24;
            if (r23 instanceof AnonymousClass2m9) {
                try {
                    r02.A0C.A02 = System.currentTimeMillis();
                    C28051Sr.A1m(C28051Sr.A29((byte[]) ((AnonymousClass2m9) r23).A00), false, r02);
                } catch (C29001Wo e2) {
                    throw new C58162lT(e2.ex.getMessage(), r23, r02, r25, i, e2);
                } catch (RuntimeException e3) {
                    throw new C58162lT("Server Hello parse error.", r23, r02, r25, i, e3);
                }
            } else {
                throw new C58162lT("Unexpected event type", r23, r02, r25, i, new C29001Wo((byte) 80, new SSLException("Unexpected event")));
            }
        } else if (this instanceof C58332lk) {
            C58382lp r03 = (C58382lp) r24;
            if (r23 instanceof C58572m8) {
                try {
                    r03.A0C.A02 = System.currentTimeMillis();
                    if (!C28051Sr.A1y(C28051Sr.A2A((byte[]) r03.A0U.get("server_finished"), r03.A0D.A02(), r03.A0P), C28051Sr.A29((byte[]) r23.A00))) {
                        throw new C58162lT("Failed to verify server fin.", r23, r03, r25, i, new C29001Wo((byte) 80, new SSLException("Failed to verify server fin.")));
                    }
                } catch (C29001Wo e4) {
                    throw new C58162lT("Failed to process finished message.", r23, r03, r25, i, e4);
                }
            } else {
                throw new C58162lT("Unexpected event type", r23, r03, r25, i, new C29001Wo((byte) 80, new SSLException("Unexpected event")));
            }
        } else if (this instanceof C58322lj) {
            C58382lp r04 = (C58382lp) r24;
            r04.A0C.A02 = System.currentTimeMillis();
            if (r23 instanceof C58562m7) {
                try {
                    byte[] bytes = "TLS 1.3, server CertificateVerify".getBytes("UTF-8");
                    byte[] bArr = new byte[64];
                    Arrays.fill(bArr, (byte) 32);
                    try {
                        ByteBuffer wrap = ByteBuffer.wrap(C28051Sr.A29((byte[]) r23.A00));
                        short s = wrap.getShort();
                        byte[] bArr2 = new byte[2];
                        wrap.get(bArr2);
                        byte[] bArr3 = new byte[C28051Sr.A0F(bArr2)];
                        wrap.get(bArr3);
                        AnonymousClass3WH r5 = r04.A0H;
                        if (r5 == null) {
                            throw null;
                        } else if (s != 1027) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Expected signature scheme ");
                            if (r5 != null) {
                                sb.append(1027);
                                sb.append(" got ");
                                sb.append((int) s);
                                String obj = sb.toString();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Expected signature scheme ");
                                sb2.append(1027);
                                sb2.append(" got ");
                                sb2.append((int) s);
                                throw new C58162lT(obj, r23, r04, r25, i, new C29001Wo((byte) 80, new SSLException(sb2.toString())));
                            }
                            throw null;
                        } else {
                            byte[] A02 = r04.A0D.A02();
                            ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 64 + 1 + A02.length);
                            allocate.put(bArr);
                            allocate.put(bytes);
                            allocate.put((byte) 0);
                            allocate.put(A02);
                            byte[] array = allocate.array();
                            ArrayList arrayList = new ArrayList();
                            for (C50592Vh r3 : r04.A0T) {
                                try {
                                    arrayList.add(CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(r3.A01)));
                                } catch (CertificateException e5) {
                                    throw new C58162lT("Bad certificate", r23, r04, r25, i, new SSLException(e5));
                                }
                            }
                            try {
                                AnonymousClass3WI r13 = r04.A0I;
                                X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
                                String str2 = r04.A0Q;
                                try {
                                    if (r13.A00 == null) {
                                        throw new C29001Wo((byte) 80, new SSLException("Trust Manager cannot be null."));
                                    } else if (x509CertificateArr == null || x509CertificateArr.length == 0) {
                                        throw new C29001Wo((byte) 80, new SSLException("Null or empty certificates certificates"));
                                    } else {
                                        Signature instance = Signature.getInstance("SHA256withECDSA");
                                        instance.initVerify(x509CertificateArr[0]);
                                        instance.update(array);
                                        boolean verify = instance.verify(bArr3);
                                        if (verify) {
                                            try {
                                                X509TrustManager x509TrustManager = r13.A00;
                                                synchronized (AnonymousClass3WH.class) {
                                                    r2 = AnonymousClass3WH.A00;
                                                    if (r2 == null) {
                                                        r2 = new AnonymousClass3WH();
                                                        AnonymousClass3WH.A00 = r2;
                                                    }
                                                }
                                                if (r2 != null) {
                                                    x509TrustManager.checkServerTrusted(x509CertificateArr, "EC");
                                                } else {
                                                    throw null;
                                                }
                                            } catch (CertificateException e6) {
                                                throw new C29001Wo((byte) 42, new SSLException("Certificate could not be verified", e6));
                                            }
                                        }
                                        C29011Wq r32 = new C29011Wq(null, "", -1, "");
                                        r32.A01(x509CertificateArr);
                                        boolean verify2 = HttpsURLConnection.getDefaultHostnameVerifier().verify(str2, r32);
                                        if (!verify || !verify2) {
                                            throw new C58162lT("Certificates could not be verified.", r23, r04, r25, i, new C29001Wo((byte) 42, new SSLException("ServerCertificate verify failed.")));
                                        }
                                        r04.A0C.A01((Certificate[]) arrayList.toArray(new Certificate[0]));
                                        r04.A0b = true;
                                    }
                                } catch (NoSuchAlgorithmException unused) {
                                    throw new C29001Wo((byte) 80, new SSLException("SHA256withECDSA not found."));
                                } catch (InvalidKeyException unused2) {
                                    throw new C29001Wo((byte) 42, new SSLException("Certificate key is invalid."));
                                } catch (SignatureException unused3) {
                                    throw new C29001Wo((byte) 42, new SSLException("Signature is invalid"));
                                }
                            } catch (C29001Wo e7) {
                                throw new C58162lT("Certificates verify failed.", r23, r04, r25, i, e7);
                            }
                        }
                    } catch (C29001Wo e8) {
                        throw new C58162lT("", r23, r04, r25, i, e8);
                    }
                } catch (UnsupportedEncodingException e9) {
                    throw new C58162lT("Could not encode context string in UTF-8", r23, r04, r25, i, new C29001Wo((byte) 80, new SSLException(e9)));
                }
            } else {
                throw new C58162lT("Unexpected event type", r23, r04, r25, i, new C29001Wo((byte) 80, new SSLException("Unexpected event")));
            }
        } else if (this instanceof C58312li) {
            C58382lp r05 = (C58382lp) r24;
            if (r23 instanceof C58552m6) {
                try {
                    r05.A0C.A02 = System.currentTimeMillis();
                    ByteBuffer wrap2 = ByteBuffer.wrap(C28051Sr.A29((byte[]) ((C58552m6) r23).A00));
                    if (wrap2.get() == 0) {
                        byte[] bArr4 = new byte[3];
                        wrap2.get(bArr4);
                        int A0E = C28051Sr.A0E(bArr4);
                        byte[] bArr5 = new byte[A0E];
                        wrap2.get(bArr5);
                        ArrayList arrayList2 = new ArrayList();
                        ByteBuffer wrap3 = ByteBuffer.wrap(bArr5);
                        int i2 = 0;
                        while (i2 < A0E) {
                            byte[] bArr6 = new byte[3];
                            wrap3.get(bArr6);
                            int A0E2 = C28051Sr.A0E(bArr6);
                            byte[] bArr7 = new byte[A0E2];
                            wrap3.get(bArr7);
                            byte[] bArr8 = new byte[2];
                            wrap3.get(bArr8);
                            int A0F = C28051Sr.A0F(bArr8);
                            byte[] bArr9 = new byte[A0F];
                            wrap3.get(bArr9);
                            i2 += A0E2 + 3 + 2 + A0F;
                            arrayList2.add(new C50592Vh(bArr7, new C50642Vm(bArr9)));
                        }
                        r05.A0T = arrayList2;
                        return;
                    }
                    throw new C58162lT("Unexpected certificate size", r23, r05, r25, i, new C29001Wo((byte) 80, new SSLException("Unexpected Message")));
                } catch (C29001Wo e10) {
                    throw new C58162lT("Failed to process certificate", r23, r05, r25, i, e10);
                } catch (RuntimeException e11) {
                    throw new C58162lT("Failed to parse certificate.", r23, r05, r25, i, e11);
                }
            } else {
                throw new C58162lT("Unexpected event type", r23, r05, r25, i, new C29001Wo((byte) 80, new SSLException("Unexpected event")));
            }
        } else if (this instanceof C58302lh) {
            C58382lp r06 = (C58382lp) r24;
            r06.A0C.A02 = System.currentTimeMillis();
            throw new C58162lT("Unexpected event type", r23, r06, r25, i, new C29001Wo((byte) 80, new SSLException("Unexpected event")));
        } else if (this instanceof C58292lg) {
            C58382lp r07 = (C58382lp) r24;
            r07.A0C.A02 = System.currentTimeMillis();
            if (r23 instanceof C58532m4) {
                try {
                    ByteBuffer wrap4 = ByteBuffer.wrap(C28051Sr.A29((byte[]) r23.A00));
                    byte b = wrap4.get();
                    if (b == 1 || b == 0) {
                        byte[] A01 = r07.A09.A01((byte[]) r07.A0U.get("server_app_traffic_secret"), C28051Sr.A28("traffic upd", new byte[0], r07.A02), r07.A02);
                        r07.A0U.put("server_app_traffic_secret", A01);
                        AnonymousClass2VS r10 = r07.A09;
                        byte[] bArr10 = new byte[0];
                        if (r07.A0E != null) {
                            byte[] A28 = C28051Sr.A28("key", bArr10, 16);
                            if (r07.A0E != null) {
                                r07.A0U.put("server_app_key", r10.A01(A01, A28, 16));
                                AnonymousClass2VS r11 = r07.A09;
                                byte[] bArr11 = new byte[0];
                                if (r07.A0E != null) {
                                    byte[] A282 = C28051Sr.A28("iv", bArr11, 12);
                                    if (r07.A0E != null) {
                                        r07.A0U.put("server_app_iv", r11.A01(A01, A282, 12));
                                        int i3 = r07.A03 + 1;
                                        r07.A03 = i3;
                                        AnonymousClass2VU r4 = AnonymousClass2VU.DEBUG;
                                        StringBuilder A0S = AnonymousClass008.A0S("Updated Server App Traffic Keys : Current Gen = ");
                                        A0S.append(i3);
                                        AnonymousClass2VT.A00(r4, A0S.toString());
                                        AbstractC50672Vp r26 = r07.A0A;
                                        if (r26 != null) {
                                            int available = r26.A00.available();
                                            boolean z = false;
                                            if (available > 0) {
                                                z = true;
                                            }
                                            if (z) {
                                                throw new C58162lT("Unexpected Messages: Found pending handshake messages", r23, r07, r25, i, new C29001Wo((byte) 10, new SSLException("Found unprocessed messages in handshake buffer.")));
                                            }
                                        }
                                        AnonymousClass2VM A00 = AnonymousClass3WK.A00();
                                        A00.AAY((byte[]) r07.A0U.get("server_app_key"), (byte[]) r07.A0U.get("server_app_iv"));
                                        r07.A0A = new C58362ln(r07.A0M, r07.A08, A00);
                                        if (b == 1) {
                                            byte[] A22 = C28051Sr.A22((byte) 24, new byte[]{0});
                                            r07.A0B.A01((byte) 23, A22, 0, A22.length);
                                            byte[] A012 = r07.A09.A01((byte[]) r07.A0U.get("client_app_traffic_secret"), C28051Sr.A28("traffic upd", new byte[0], r07.A02), r07.A02);
                                            r07.A0U.put("client_app_traffic_secret", A012);
                                            AnonymousClass2VS r7 = r07.A09;
                                            byte[] bArr12 = new byte[0];
                                            if (r07.A0E != null) {
                                                byte[] A283 = C28051Sr.A28("key", bArr12, 16);
                                                if (r07.A0E != null) {
                                                    r07.A0U.put("client_app_key", r7.A01(A012, A283, 16));
                                                    AnonymousClass2VS r6 = r07.A09;
                                                    byte[] bArr13 = new byte[0];
                                                    if (r07.A0E != null) {
                                                        byte[] A284 = C28051Sr.A28("iv", bArr13, 12);
                                                        if (r07.A0E != null) {
                                                            r07.A0U.put("client_app_iv", r6.A01(A012, A284, 12));
                                                            int i4 = r07.A01 + 1;
                                                            r07.A01 = i4;
                                                            StringBuilder A0S2 = AnonymousClass008.A0S("Updated Client App Traffic Keys : Current Gen = ");
                                                            A0S2.append(i4);
                                                            AnonymousClass2VT.A00(r4, A0S2.toString());
                                                            AnonymousClass2VM A002 = AnonymousClass3WK.A00();
                                                            A002.AAY((byte[]) r07.A0U.get("client_app_key"), (byte[]) r07.A0U.get("client_app_iv"));
                                                            r07.A0B = new C58372lo(r07.A0N, A002);
                                                        } else {
                                                            throw null;
                                                        }
                                                    } else {
                                                        throw null;
                                                    }
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                throw null;
                                            }
                                        }
                                        if (wrap4.hasRemaining()) {
                                            throw new C58162lT("Key update message has more than expected bytes.", r23, r07, r25, i, new C29001Wo((byte) 80, new SSLException("Key update message has more than expected bytes.")));
                                        }
                                        return;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid key update type ");
                    sb3.append((int) b);
                    String obj2 = sb3.toString();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid key update type ");
                    sb4.append((int) b);
                    throw new C58162lT(obj2, r23, r07, r25, i, new C29001Wo((byte) 10, new SSLException(sb4.toString())));
                } catch (C29001Wo e12) {
                    throw new C58162lT("Receive key update failed.", r23, r07, r25, i, e12);
                }
            } else {
                throw new C58162lT("Unexpected event type", r23, r07, r25, i, new C29001Wo((byte) 80, new SSLException("Unexpected event")));
            }
        } else if (this instanceof C58282lf) {
            C58382lp r08 = (C58382lp) r24;
            r08.A0C.A02 = System.currentTimeMillis();
            if (r23 instanceof C58512m2) {
                try {
                    ByteBuffer wrap5 = ByteBuffer.wrap(C28051Sr.A29((byte[]) r23.A00));
                    byte[] bArr14 = new byte[4];
                    wrap5.get(bArr14);
                    if (C28051Sr.A0J(bArr14) != 0) {
                        byte[] bArr15 = new byte[4];
                        wrap5.get(bArr15);
                        byte[] bArr16 = new byte[((short) (((short) (wrap5.get() & 255)) | 0))];
                        wrap5.get(bArr16);
                        int i5 = 2;
                        byte[] bArr17 = new byte[2];
                        wrap5.get(bArr17);
                        byte[] bArr18 = new byte[C28051Sr.A0F(bArr17)];
                        wrap5.get(bArr18);
                        byte[] bArr19 = new byte[2];
                        wrap5.get(bArr19);
                        int A0F2 = C28051Sr.A0F(bArr19);
                        byte[] bArr20 = new byte[A0F2];
                        wrap5.get(bArr20);
                        HashMap hashMap = new HashMap();
                        ArrayList arrayList3 = new ArrayList();
                        ByteBuffer wrap6 = ByteBuffer.wrap(bArr20);
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < A0F2) {
                            short s2 = wrap6.getShort();
                            byte[] bArr21 = new byte[i5];
                            wrap6.get(bArr21);
                            int A0F3 = C28051Sr.A0F(bArr21);
                            byte[] bArr22 = new byte[A0F3];
                            wrap6.get(bArr22);
                            arrayList3.add(new C50632Vl(s2, bArr22));
                            hashMap.put(Short.valueOf(s2), Integer.valueOf(i7));
                            i7++;
                            i6 += A0F3 + 4;
                            i5 = 2;
                        }
                        if (i6 == A0F2) {
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            Number number = (Number) hashMap.get((short) 42);
                            if (number == null || (intValue = number.intValue()) >= i7 || (r22 = (C50632Vl) arrayList4.get(intValue)) == null) {
                                j = 0;
                            } else {
                                j = C28051Sr.A0J(r22.A01);
                            }
                            byte[] A013 = r08.A09.A01((byte[]) r08.A0U.get("resumption_master_secret"), C28051Sr.A28("resumption", bArr16, r08.A02), r08.A02);
                            if (r08.A0E != null) {
                                r08.A0C.A07.add(new WtCachedPsk(A013, j, bArr15, bArr14, bArr18, r08.A0Q, r08.A0C.A00().byteValue()));
                                if (!wrap5.hasRemaining()) {
                                    C006403e r33 = r08.A0L;
                                    C29011Wq r72 = r08.A0C;
                                    synchronized (r33) {
                                        AnonymousClass1YY r62 = new AnonymousClass1YY(r72.getId());
                                        try {
                                            Map map = r33.A01;
                                            synchronized (map) {
                                                C29011Wq r52 = (C29011Wq) map.get(r62);
                                                if (r52 == null) {
                                                    r52 = new C29011Wq(r33, r72.getPeerHost(), r72.getPeerPort(), r72.getCipherSuite());
                                                    map.put(r62, r52);
                                                }
                                                r52.A08.put(r72.A00(), r72.getPeerCertificates());
                                                Iterator it = r72.A07.iterator();
                                                while (it.hasNext()) {
                                                    r52.A07.add((WtCachedPsk) it.next());
                                                }
                                                C006503f r1 = r33.A00;
                                                if (r1 != null) {
                                                    r1.A04(r62.A01, new WtPersistentSession(r52.getPeerHost(), r52.getPeerPort(), r52.getCipherSuite(), r52.A07, r52.A08));
                                                }
                                            }
                                        } catch (C29001Wo e13) {
                                            StringBuilder sb5 = new StringBuilder();
                                            sb5.append("Encountered Exception ");
                                            sb5.append(e13.toString());
                                            Log.e(sb5.toString());
                                        }
                                    }
                                    return;
                                }
                                throw new C58162lT("New session ticket has excess bytes than expected", r23, r08, r25, i, new C29001Wo((byte) 80, new SSLException("New session ticket has more bytes than expected.")));
                            }
                            throw null;
                        }
                        throw new C29001Wo((byte) 80, new SSLException("Error while parsing extension"));
                    }
                } catch (C29001Wo e14) {
                    throw new C58162lT("Failed to process new session ticket", r23, r08, r25, i, e14);
                }
            } else {
                throw new C58162lT("Unexpected event type", r23, r08, r25, i, new C29001Wo((byte) 80, new SSLException("Unexpected event")));
            }
        } else if (this instanceof C58272le) {
            C58382lp r09 = (C58382lp) r24;
            if (r23 instanceof C58502m1) {
                try {
                    r09.A0C.A02 = System.currentTimeMillis();
                    byte[] bArr23 = (byte[]) ((C58502m1) r23).A00;
                    C28051Sr.A1m(C28051Sr.A29(bArr23), true, r09);
                    r09.A0c = true;
                    r09.A0f = false;
                    byte[] A022 = r09.A0D.A02();
                    C50722Vu r34 = r09.A0D;
                    r34.A00.reset();
                    r34.A01 = null;
                    r09.A0D.A00(C28051Sr.A22((byte) -2, A022));
                    r09.A0D.A00(bArr23);
                } catch (C29001Wo e15) {
                    throw new C58162lT(e15.ex.getMessage(), r23, r09, r25, i, e15);
                } catch (RuntimeException e16) {
                    throw new C58162lT("Hello retry parse error.", r23, r09, r25, i, e16);
                }
            } else {
                throw new C58162lT("Unexpected event type", r23, r09, r25, i, new C29001Wo((byte) 80, new SSLException("Unexpected event")));
            }
        } else if (this instanceof C58262ld) {
            C58382lp r010 = (C58382lp) r24;
            r010.A0C.A02 = System.currentTimeMillis();
            if (r23 instanceof C58492m0) {
                try {
                    ByteBuffer wrap7 = ByteBuffer.wrap(C28051Sr.A29((byte[]) r23.A00));
                    byte[] bArr24 = new byte[2];
                    wrap7.get(bArr24);
                    int A0F4 = C28051Sr.A0F(bArr24);
                    byte[] bArr25 = new byte[A0F4];
                    wrap7.get(bArr25);
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList5 = new ArrayList();
                    ByteBuffer wrap8 = ByteBuffer.wrap(bArr25);
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < A0F4) {
                        short s3 = wrap8.getShort();
                        byte[] bArr26 = new byte[2];
                        wrap8.get(bArr26);
                        int A0F5 = C28051Sr.A0F(bArr26);
                        byte[] bArr27 = new byte[A0F5];
                        wrap8.get(bArr27);
                        arrayList5.add(new C50632Vl(s3, bArr27));
                        hashMap2.put(Short.valueOf(s3), Integer.valueOf(i9));
                        i9++;
                        i8 += A0F5 + 4;
                    }
                    if (i8 == A0F4) {
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        Integer num = (Integer) hashMap2.get((short) 16);
                        if (!(num == null || (intValue3 = num.intValue()) >= i9 || (r8 = (C50632Vl) arrayList6.get(intValue3)) == null || (str = r010.A0O) == null || str.isEmpty())) {
                            ByteBuffer wrap9 = ByteBuffer.wrap(r8.A01);
                            byte[] bArr28 = new byte[2];
                            wrap9.get(bArr28);
                            int A0F6 = C28051Sr.A0F(bArr28);
                            HashSet hashSet = new HashSet();
                            int i10 = 0;
                            while (i10 < A0F6) {
                                int i11 = wrap9.get();
                                byte[] bArr29 = new byte[i11];
                                wrap9.get(bArr29);
                                try {
                                    hashSet.add(new String(bArr29, "UTF-8"));
                                    i10 += i11 + 1;
                                } catch (UnsupportedEncodingException e17) {
                                    throw new C58162lT("Server protocol is not encoded using UTF-8", r23, r010, r25, i, new C29001Wo((byte) 80, new SSLException(e17)));
                                }
                            }
                            if (!hashSet.contains(r010.A0O)) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("Server selected wrong supported version ");
                                sb6.append(r8.toString());
                                sb6.append(" expected: ");
                                sb6.append(r010.A0O);
                                throw new C58162lT("Server sent unsupported protocol version.", r23, r010, r25, i, new C29001Wo((byte) 110, new SSLException(sb6.toString())));
                            }
                        }
                        Integer num2 = (Integer) hashMap2.get((short) 42);
                        if (!(num2 == null || (intValue2 = num2.intValue()) >= i9 || ((C50632Vl) arrayList6.get(intValue2)) == null)) {
                            boolean z2 = r010.A0Z;
                            if (z2 && r010.A0C.A03 != null) {
                                r010.A0f = true;
                            } else if (!z2) {
                                throw new C58162lT("Received server early data indication without sending early data.", r23, r010, r25, i, new C29001Wo((byte) 10, new SSLException("Should not have received early data indication without sending early data.")));
                            }
                        }
                        Set set = C50612Vj.A06;
                        HashSet hashSet2 = new HashSet(hashMap2.keySet());
                        hashSet2.removeAll(set);
                        if (hashSet2.size() != 0) {
                            throw new C58162lT("Unexpected extension provided by the server", r23, r010, r25, i, new C29001Wo((byte) 47, new SSLException("Unexpected extension provided by the server")));
                        } else if (wrap7.hasRemaining()) {
                            throw new C58162lT("Encrypted extensions has excess bytes than expected", r23, r010, r25, i, new C29001Wo((byte) 80, new SSLException("Encrypted extensions has more bytes than expected.")));
                        }
                    } else {
                        throw new C29001Wo((byte) 80, new SSLException("Error while parsing extension"));
                    }
                } catch (C29001Wo e18) {
                    throw new C58162lT("Failed to process encrypted extensions", r23, r010, r25, i, e18);
                } catch (RuntimeException e19) {
                    e = e19;
                    String message = e.getMessage();
                    if (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new C58162lT("Failed to parse encrypted extensions", r23, r010, r25, i, new C29001Wo((byte) 80, new SSLException(message, e)));
                }
            } else {
                throw new C58162lT("Unexpected event type", r23, r010, r25, i, new C29001Wo((byte) 80, new SSLException("Unexpected event")));
            }
        } else if (this instanceof C58252lc) {
            C58382lp r011 = (C58382lp) r24;
            C29011Wq r42 = r011.A0C;
            r42.A02 = System.currentTimeMillis();
            if (r23 instanceof C58472ly) {
                AnonymousClass2VR r9 = (AnonymousClass2VR) r23.A00;
                WtCachedPsk wtCachedPsk = r42.A03;
                try {
                    int i12 = r9.A00;
                    if (((long) i12) <= wtCachedPsk.maxEarlyDataSize) {
                        r011.A0B.A01((byte) 23, r9.A02, r9.A01, i12);
                        return;
                    }
                    throw new C58162lT("Data size exceeds early data", r23, r011, r25, i, new C29001Wo((byte) 80, new SSLException("Data to be written more than early data size")));
                } catch (C29001Wo e20) {
                    throw new C58162lT("App write for early data failed.", r23, r011, r25, i, e20);
                }
            } else {
                throw new C58162lT("Unexpected event type", r23, r011, r25, i, new C29001Wo((byte) 80, new SSLException("Unexpected event")));
            }
        } else if (this instanceof C58242lb) {
            C58382lp r012 = (C58382lp) r24;
            try {
                byte[] A014 = r012.A0D.A01();
                byte[] bArr30 = (byte[]) r012.A0U.get("master_secret");
                if (bArr30 != null) {
                    r012.A0U.put("resumption_master_secret", r012.A09.A01(bArr30, C28051Sr.A28("res master", A014, r012.A02), r012.A02));
                    AnonymousClass2VM A003 = AnonymousClass3WK.A00();
                    A003.AAY((byte[]) r012.A0U.get("client_app_key"), (byte[]) r012.A0U.get("client_app_iv"));
                    r012.A0B = new C58372lo(r012.A0N, A003);
                    AbstractC50672Vp r27 = r012.A0A;
                    if (r27 != null) {
                        int available2 = r27.A00.available();
                        boolean z3 = false;
                        if (available2 > 0) {
                            z3 = true;
                        }
                        if (z3) {
                            throw new C58162lT("Unexpected Messages: Found pending handshake messages", r23, r012, r25, i, new C29001Wo((byte) 10, new SSLException("Found unprocessed messages in handshake buffer.")));
                        }
                    }
                    AnonymousClass2VM A004 = AnonymousClass3WK.A00();
                    A004.AAY((byte[]) r012.A0U.get("server_app_key"), (byte[]) r012.A0U.get("server_app_iv"));
                    r012.A0A = new C58362ln(r012.A0M, r012.A08, A004);
                    return;
                }
                throw new C58162lT("Master Secret is null", r23, r012, r25, i, new C29001Wo((byte) 80, new SSLException("Master Secret is null")));
            } catch (C29001Wo e21) {
                throw new C58162lT("Failed to derive resumption keys", r23, r012, r25, i, e21);
            }
        } else if (this instanceof C58232la) {
            C58382lp r013 = (C58382lp) r24;
            r013.A0C.A02 = System.currentTimeMillis();
            try {
                byte[] A015 = r013.A0D.A01();
                byte[] A04 = r013.A0G.A00.A04(r013.A0m, r013.A0h);
                int i13 = r013.A02;
                byte[] bArr31 = new byte[i13];
                WtCachedPsk wtCachedPsk2 = r013.A0C.A03;
                if (wtCachedPsk2 != null && r013.A0g) {
                    bArr31 = wtCachedPsk2.pskVal;
                }
                byte[] A005 = r013.A09.A00(new byte[i13], bArr31);
                r013.A0U.put("early_secret", A005);
                MessageDigest instance2 = MessageDigest.getInstance(r013.A0P);
                byte[] A016 = r013.A09.A01(A005, C28051Sr.A28("derived", instance2.digest(), r013.A02), r013.A02);
                r013.A0U.put("derived_secret", A016);
                byte[] A006 = r013.A09.A00(A016, A04);
                r013.A0U.put("handshake_secret", A006);
                byte[] A017 = r013.A09.A01(A006, C28051Sr.A28("c hs traffic", A015, r013.A02), r013.A02);
                r013.A0U.put("client_hs_traffic_secret", A017);
                byte[] A018 = r013.A09.A01(A006, C28051Sr.A28("s hs traffic", A015, r013.A02), r013.A02);
                r013.A0U.put("server_hs_traffic_secret", A018);
                r013.A0U.put("derived_secret", r013.A09.A01(A006, C28051Sr.A28("derived", instance2.digest(), r013.A02), r013.A02));
                AnonymousClass2VS r43 = r013.A09;
                byte[] bArr32 = new byte[0];
                if (r013.A0E != null) {
                    byte[] A285 = C28051Sr.A28("key", bArr32, 16);
                    if (r013.A0E != null) {
                        r013.A0U.put("client_hs_key", r43.A01(A017, A285, 16));
                        AnonymousClass2VS r44 = r013.A09;
                        byte[] bArr33 = new byte[0];
                        if (r013.A0E != null) {
                            byte[] A286 = C28051Sr.A28("iv", bArr33, 12);
                            if (r013.A0E != null) {
                                r013.A0U.put("client_hs_iv", r44.A01(A017, A286, 12));
                                AnonymousClass2VS r45 = r013.A09;
                                byte[] bArr34 = new byte[0];
                                if (r013.A0E != null) {
                                    byte[] A287 = C28051Sr.A28("key", bArr34, 16);
                                    if (r013.A0E != null) {
                                        byte[] A019 = r45.A01(A018, A287, 16);
                                        r013.A0U.put("server_hs_key", A019);
                                        AnonymousClass2VS r46 = r013.A09;
                                        byte[] bArr35 = new byte[0];
                                        if (r013.A0E != null) {
                                            byte[] A288 = C28051Sr.A28("iv", bArr35, 12);
                                            if (r013.A0E != null) {
                                                byte[] A0110 = r46.A01(A018, A288, 12);
                                                r013.A0U.put("server_hs_iv", A0110);
                                                r013.A0U.put("client_finished", r013.A09.A01(A017, C28051Sr.A28("finished", new byte[0], r013.A02), r013.A02));
                                                r013.A0U.put("server_finished", r013.A09.A01(A018, C28051Sr.A28("finished", new byte[0], r013.A02), r013.A02));
                                                AnonymousClass2VM A007 = AnonymousClass3WK.A00();
                                                A007.AAY(A019, A0110);
                                                AbstractC50672Vp r28 = r013.A0A;
                                                if (r28 != null) {
                                                    int available3 = r28.A00.available();
                                                    boolean z4 = false;
                                                    if (available3 > 0) {
                                                        z4 = true;
                                                    }
                                                    if (z4) {
                                                        throw new C58162lT("Unexpected Messages: Found pending handshake messages", r23, r013, r25, i, new C29001Wo((byte) 10, new SSLException("Found unprocessed messages in handshake buffer.")));
                                                    }
                                                }
                                                r013.A0A = new C58362ln(r013.A0M, r013.A08, A007);
                                                return;
                                            }
                                            throw null;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            } catch (C29001Wo e22) {
                throw new C58162lT("Failed in action handshake traffic keys", r23, r013, r25, i, e22);
            } catch (NoSuchAlgorithmException e23) {
                throw new C58162lT(AnonymousClass008.A0O(new StringBuilder(), r013.A0P, " algorithm not found"), r23, r013, r25, i, new C29001Wo((byte) 80, new SSLException(e23)));
            }
        } else if (this instanceof C58222lZ) {
            C58382lp r014 = (C58382lp) r24;
            C29011Wq r47 = r014.A0C;
            r47.A02 = System.currentTimeMillis();
            try {
                byte[] A008 = r014.A09.A00(new byte[r014.A02], r47.A03.pskVal);
                r014.A0U.put("early_secret", A008);
                byte[] A0111 = r014.A09.A01(A008, C28051Sr.A28("c e traffic", r014.A0D.A01(), r014.A02), r014.A02);
                r014.A0U.put("client_early_traffic_secret", A0111);
                AnonymousClass2VS r63 = r014.A09;
                byte[] bArr36 = new byte[0];
                if (r014.A0E != null) {
                    byte[] A289 = C28051Sr.A28("key", bArr36, 16);
                    if (r014.A0E != null) {
                        byte[] A0112 = r63.A01(A0111, A289, 16);
                        AnonymousClass2VS r64 = r014.A09;
                        byte[] bArr37 = new byte[0];
                        if (r014.A0E != null) {
                            byte[] A2810 = C28051Sr.A28("iv", bArr37, 12);
                            if (r014.A0E != null) {
                                byte[] A0113 = r64.A01(A0111, A2810, 12);
                                AnonymousClass2VM A009 = AnonymousClass3WK.A00();
                                A009.AAY(A0112, A0113);
                                r014.A0B = new C58372lo(r014.A0N, A009);
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            } catch (C29001Wo e24) {
                throw new C58162lT("Failed in action early data keys", r23, r014, r25, i, e24);
            }
        } else if (this instanceof C58212lY) {
            C58382lp r015 = (C58382lp) r24;
            r015.A0C.A02 = System.currentTimeMillis();
            try {
                byte[] A0114 = r015.A0D.A01();
                byte[] bArr38 = (byte[]) r015.A0U.get("derived_secret");
                if (bArr38 != null) {
                    byte[] A0010 = r015.A09.A00(bArr38, new byte[r015.A02]);
                    r015.A0U.put("master_secret", A0010);
                    byte[] A0115 = r015.A09.A01(A0010, C28051Sr.A28("c ap traffic", A0114, r015.A02), r015.A02);
                    r015.A0U.put("client_app_traffic_secret", A0115);
                    AnonymousClass2VS r48 = r015.A09;
                    byte[] bArr39 = new byte[0];
                    if (r015.A0E != null) {
                        byte[] A2811 = C28051Sr.A28("key", bArr39, 16);
                        if (r015.A0E != null) {
                            r015.A0U.put("client_app_key", r48.A01(A0115, A2811, 16));
                            AnonymousClass2VS r49 = r015.A09;
                            byte[] bArr40 = new byte[0];
                            if (r015.A0E != null) {
                                byte[] A2812 = C28051Sr.A28("iv", bArr40, 12);
                                if (r015.A0E != null) {
                                    r015.A0U.put("client_app_iv", r49.A01(A0115, A2812, 12));
                                    byte[] A0116 = r015.A09.A01(A0010, C28051Sr.A28("s ap traffic", A0114, r015.A02), r015.A02);
                                    r015.A0U.put("server_app_traffic_secret", A0116);
                                    AnonymousClass2VS r410 = r015.A09;
                                    byte[] bArr41 = new byte[0];
                                    if (r015.A0E != null) {
                                        byte[] A2813 = C28051Sr.A28("key", bArr41, 16);
                                        if (r015.A0E != null) {
                                            r015.A0U.put("server_app_key", r410.A01(A0116, A2813, 16));
                                            AnonymousClass2VS r411 = r015.A09;
                                            byte[] bArr42 = new byte[0];
                                            if (r015.A0E != null) {
                                                byte[] A2814 = C28051Sr.A28("iv", bArr42, 12);
                                                if (r015.A0E != null) {
                                                    r015.A0U.put("server_app_iv", r411.A01(A0116, A2814, 12));
                                                    r015.A0U.put("exporter_master_secret", r015.A09.A01(A0010, C28051Sr.A28("exp master", A0114, r015.A02), r015.A02));
                                                    return;
                                                }
                                                throw null;
                                            }
                                            throw null;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw new C58162lT("Derived secret not found.", r23, r015, r25, i, new C29001Wo((byte) 80, new SSLException("Derived secret not found.")));
            } catch (C29001Wo e25) {
                throw new C58162lT("Failed to derive app traffic keys", r23, r015, r25, i, e25);
            }
        } else if (this instanceof C58202lX) {
            C58382lp r016 = (C58382lp) r24;
            if (r23 instanceof C58422lt) {
                try {
                    ByteBuffer wrap10 = ByteBuffer.wrap(C28051Sr.A29((byte[]) r23.A00));
                    if (((short) (((short) (wrap10.get() & 255)) | 0)) == 0) {
                        byte[] bArr43 = new byte[2];
                        wrap10.get(bArr43);
                        int A0F7 = C28051Sr.A0F(bArr43);
                        byte[] bArr44 = new byte[A0F7];
                        wrap10.get(bArr44);
                        HashMap hashMap3 = new HashMap();
                        ArrayList arrayList7 = new ArrayList();
                        ByteBuffer wrap11 = ByteBuffer.wrap(bArr44);
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < A0F7) {
                            short s4 = wrap11.getShort();
                            byte[] bArr45 = new byte[2];
                            wrap11.get(bArr45);
                            int A0F8 = C28051Sr.A0F(bArr45);
                            byte[] bArr46 = new byte[A0F8];
                            wrap11.get(bArr46);
                            arrayList7.add(new C50632Vl(s4, bArr46));
                            hashMap3.put(Short.valueOf(s4), Integer.valueOf(i15));
                            i15++;
                            i14 += A0F8 + 4;
                        }
                        if (i14 == A0F7) {
                            new ArrayList(arrayList7);
                            r016.A0X = true;
                            return;
                        }
                        throw new C29001Wo((byte) 80, new SSLException("Error while parsing extension"));
                    }
                    throw new C58162lT("Certificate context is not expected", r23, r016, r25, i, new C29001Wo((byte) 10, new SSLException("Certificate context is not expected.")));
                } catch (C29001Wo e26) {
                    throw new C58162lT("Failed to process certificate request ", r23, r016, r25, i, e26);
                }
            } else {
                throw new C58162lT("Unexpected event type", r23, r016, r25, i, new C29001Wo((byte) 80, new SSLException("Unexpected event")));
            }
        } else if (this instanceof C58192lW) {
            C58382lp r017 = (C58382lp) r24;
            r017.A0C.A02 = System.currentTimeMillis();
            if (r23 instanceof C58412ls) {
                AnonymousClass2VR r29 = (AnonymousClass2VR) r23.A00;
                try {
                    r017.A0B.A01((byte) 23, r29.A02, r29.A01, r29.A00);
                } catch (C29001Wo e27) {
                    throw new C58162lT("App write failed.", r23, r017, r25, i, e27);
                }
            } else {
                throw new C58162lT("Unexpected event type", r23, r017, r25, i, new C29001Wo((byte) 80, new SSLException("Unexpected event")));
            }
        } else if (!(this instanceof C58182lV)) {
            ((C58382lp) r24).A0C.A02 = System.currentTimeMillis();
        } else {
            C58382lp r018 = (C58382lp) r24;
            r018.A0C.A02 = System.currentTimeMillis();
            if (r23 instanceof C58402lr) {
                byte[] bArr47 = (byte[]) r23.A00;
                if (bArr47 != null) {
                    try {
                        ((C58142lR) r018.A07).A01(bArr47, bArr47.length);
                    } catch (IOException e28) {
                        throw new C58162lT("App read failed.", r23, r018, r25, i, e28);
                    }
                } else {
                    throw new C58162lT("App read failed.", r23, r018, r25, i, new SSLException("App read failed."));
                }
            } else {
                throw new C58162lT("Unexpected event type", r23, r018, r25, i, new C29001Wo((byte) 80, new SSLException("Unexpected event")));
            }
        }
    }
}
