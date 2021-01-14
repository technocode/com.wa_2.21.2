package X;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;

/* renamed from: X.3Wz  reason: invalid class name and case insensitive filesystem */
public class C73353Wz extends AbstractC68073Bp {
    public static final Class A0C;
    public int A00 = 0;
    public int A01 = -1;
    public String A02 = null;
    public String A03 = null;
    public PBEParameterSpec A04 = null;
    public AbstractC11690gn A05 = new C11680gm();
    public C11720gq A06;
    public C11550gV A07;
    public AbstractC68053Bn A08 = new C73343Wy(new C11680gm());
    public boolean A09 = true;
    public boolean A0A;
    public Class[] A0B = {RC2ParameterSpec.class, RC5ParameterSpec.class, A0C, IvParameterSpec.class, PBEParameterSpec.class};

    static {
        Class<?> cls;
        try {
            cls = C73353Wz.class.getClassLoader().loadClass("javax.crypto.spec.GCMParameterSpec");
        } catch (Exception unused) {
            cls = null;
        }
        A0C = cls;
    }

    public static final boolean A00(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || "GCM".equals(str) || "OCB".equals(str);
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        if (engineGetOutputSize(i2) + i3 <= bArr2.length) {
            if (i2 != 0) {
                try {
                    i4 = this.A08.AMA(bArr, i, i2, bArr2, i3);
                } catch (C73283Wf e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                } catch (C67983Bg e2) {
                    throw new IllegalBlockSizeException(e2.getMessage());
                }
            } else {
                i4 = 0;
            }
            return i4 + this.A08.A3r(bArr2, i3 + i4);
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    @Override // javax.crypto.CipherSpi, X.AbstractC68073Bp
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        int engineGetOutputSize = engineGetOutputSize(i2);
        byte[] bArr2 = new byte[engineGetOutputSize];
        int AMA = i2 != 0 ? this.A08.AMA(bArr, i, i2, bArr2, 0) : 0;
        try {
            int A3r = AMA + this.A08.A3r(bArr2, AMA);
            if (A3r == engineGetOutputSize) {
                return bArr2;
            }
            byte[] bArr3 = new byte[A3r];
            System.arraycopy(bArr2, 0, bArr3, 0, A3r);
            return bArr3;
        } catch (C67983Bg e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    public int engineGetBlockSize() {
        return this.A05.A4x();
    }

    public byte[] engineGetIV() {
        C11720gq r0 = this.A06;
        if (r0 != null) {
            return r0.A02;
        }
        C11550gV r02 = this.A07;
        if (r02 != null) {
            return r02.A01;
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length << 3;
    }

    public int engineGetOutputSize(int i) {
        return this.A08.A7p(i);
    }

    public AlgorithmParameters engineGetParameters() {
        if (super.A00 == null) {
            if (this.A04 != null) {
                try {
                    AlgorithmParameters instance = AlgorithmParameters.getInstance(this.A03, super.A01.A00);
                    super.A00 = instance;
                    instance.init(this.A04);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.A07 != null) {
                String A4i = this.A08.A9X().A4i();
                int indexOf = A4i.indexOf(47);
                if (indexOf >= 0) {
                    A4i = A4i.substring(0, indexOf);
                }
                try {
                    AlgorithmParameters instance2 = AlgorithmParameters.getInstance(A4i, super.A01.A00);
                    super.A00 = instance2;
                    instance2.init(this.A07.A01);
                } catch (Exception e) {
                    throw new RuntimeException(e.toString());
                }
            } else if (this.A06 != null) {
                throw new UnsupportedOperationException("aeadParams engineGetParams support was stripped out");
            }
        }
        return super.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        r1 = X.AnonymousClass008.A0S("can't handle parameter ");
        r1.append(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        throw new java.security.InvalidAlgorithmParameterException(r1.toString());
     */
    @Override // javax.crypto.CipherSpi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r4, java.security.Key r5, java.security.AlgorithmParameters r6, java.security.SecureRandom r7) {
        /*
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0030
            r2 = 0
        L_0x0004:
            java.lang.Class[] r1 = r3.A0B
            int r0 = r1.length
            if (r2 == r0) goto L_0x0019
            r0 = r1[r2]
            if (r0 == 0) goto L_0x0016
            r0 = r1[r2]     // Catch:{ Exception -> 0x0016 }
            java.security.spec.AlgorithmParameterSpec r0 = r6.getParameterSpec(r0)     // Catch:{ Exception -> 0x0016 }
            if (r0 == 0) goto L_0x0019
            goto L_0x0030
        L_0x0016:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0019:
            java.lang.String r0 = "can't handle parameter "
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            java.lang.String r0 = r6.toString()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            r0.<init>(r1)
            throw r0
        L_0x0030:
            r3.engineInit(r4, r5, r0, r7)
            r3.A00 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73353Wz.engineInit(int, java.security.Key, java.security.AlgorithmParameters, java.security.SecureRandom):void");
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        C11550gV r2;
        SecureRandom secureRandom2;
        C11520gS r22;
        C11550gV r1;
        C11550gV r12;
        this.A04 = null;
        this.A03 = null;
        super.A00 = null;
        this.A06 = null;
        if (!(key instanceof SecretKey)) {
            StringBuilder A0S = AnonymousClass008.A0S("Key for algorithm ");
            A0S.append(key.getAlgorithm());
            A0S.append(" not suitable for symmetric enryption.");
            throw new InvalidKeyException(A0S.toString());
        } else if (algorithmParameterSpec != null || !this.A05.A4i().startsWith("RC5-64")) {
            if (key instanceof C11540gU) {
                C11540gU r11 = (C11540gU) key;
                this.A03 = r11.getAlgorithm();
                r2 = r11.param;
                if (r2 != null) {
                    if (r2 instanceof C11550gV) {
                        AbstractC11530gT r6 = ((C11550gV) r2).A00;
                        if (algorithmParameterSpec instanceof IvParameterSpec) {
                            r12 = new C11550gV(r6, ((IvParameterSpec) algorithmParameterSpec).getIV());
                            this.A07 = r12;
                        }
                    } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                        r12 = new C11550gV(r2, ((IvParameterSpec) algorithmParameterSpec).getIV());
                        this.A07 = r12;
                    }
                    r2 = r12;
                } else {
                    boolean z = algorithmParameterSpec instanceof PBEParameterSpec;
                    if (z) {
                        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                        this.A04 = pBEParameterSpec;
                        this.A08.A9X().A4i();
                        if (algorithmParameterSpec == null || !z) {
                            throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
                        }
                        C11500gQ A0A2 = AnonymousClass1YV.A0A(r11.type, r11.digest);
                        byte[] encoded = r11.getEncoded();
                        if (r11.tryWrong) {
                            encoded = new byte[2];
                        }
                        byte[] salt = pBEParameterSpec.getSalt();
                        int iterationCount = pBEParameterSpec.getIterationCount();
                        A0A2.A02 = encoded;
                        A0A2.A03 = salt;
                        A0A2.A00 = iterationCount;
                        int i2 = r11.ivSize;
                        int i3 = r11.keySize;
                        if (i2 != 0) {
                            int i4 = i3 >> 3;
                            int i5 = i2 >> 3;
                            byte[] A012 = A0A2.A01(i4 + i5);
                            r2 = new C11550gV(new C11520gS(A012, i4), A012, i4, i5);
                        } else {
                            r2 = A0A2.A00(i3);
                        }
                        for (int i6 = 0; i6 != encoded.length; i6++) {
                            encoded[i6] = 0;
                        }
                    } else {
                        throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                    }
                }
                if (r2 instanceof C11550gV) {
                    this.A07 = (C11550gV) r2;
                }
            } else if (key instanceof PBEKey) {
                this.A04 = (PBEParameterSpec) algorithmParameterSpec;
                byte[] encoded2 = ((PBEKey) key).getEncoded();
                int i7 = this.A00 << 3;
                PBEParameterSpec pBEParameterSpec2 = this.A04;
                this.A08.A4i();
                if (pBEParameterSpec2 != null) {
                    C11500gQ A0A3 = AnonymousClass1YV.A0A(-1, 0);
                    byte[] salt2 = pBEParameterSpec2.getSalt();
                    int iterationCount2 = pBEParameterSpec2.getIterationCount();
                    A0A3.A02 = encoded2;
                    A0A3.A03 = salt2;
                    A0A3.A00 = iterationCount2;
                    if (i7 != 0) {
                        int i8 = i7 >> 3;
                        byte[] A013 = A0A3.A01(0 + i8);
                        r2 = new C11550gV(new C11520gS(A013, 0), A013, 0, i8);
                    } else {
                        r2 = A0A3.A00(0);
                    }
                    for (int i9 = 0; i9 != encoded2.length; i9++) {
                        encoded2[i9] = 0;
                    }
                    if (r2 instanceof C11550gV) {
                        this.A07 = (C11550gV) r2;
                    }
                } else {
                    throw new InvalidAlgorithmParameterException("Need a PBEParameter spec with a PBE key.");
                }
            } else {
                r2 = new C11520gS(key.getEncoded());
            }
            if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                Class cls = A0C;
                if (cls == null || !cls.isInstance(algorithmParameterSpec)) {
                    if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                        throw new InvalidAlgorithmParameterException("unknown parameter type.");
                    }
                } else if (A00(this.A02) || (this.A08 instanceof C73333Wx)) {
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("getTLen", new Class[0]);
                        Method declaredMethod2 = cls.getDeclaredMethod("getIV", new Class[0]);
                        if (r2 instanceof C11550gV) {
                            r22 = (C11520gS) ((C11550gV) r2).A00;
                        } else {
                            r22 = (C11520gS) r2;
                        }
                        C11720gq r0 = new C11720gq(r22, ((Integer) declaredMethod.invoke(algorithmParameterSpec, new Object[0])).intValue(), (byte[]) declaredMethod2.invoke(algorithmParameterSpec, new Object[0]));
                        this.A06 = r0;
                        r2 = r0;
                    } catch (Exception unused) {
                        throw new InvalidAlgorithmParameterException("Cannot process GCMParameterSpec.");
                    }
                } else {
                    throw new InvalidAlgorithmParameterException("GCMParameterSpec can only be used with AEAD modes.");
                }
            } else if (this.A00 != 0) {
                IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
                int length = ivParameterSpec.getIV().length;
                int i10 = this.A00;
                if (length == i10 || (this.A08 instanceof C73333Wx) || !this.A09) {
                    if (r2 instanceof C11550gV) {
                        r1 = new C11550gV(((C11550gV) r2).A00, ivParameterSpec.getIV());
                    } else {
                        r1 = new C11550gV(r2, ivParameterSpec.getIV());
                    }
                    r2 = r1;
                    this.A07 = r1;
                } else {
                    throw new InvalidAlgorithmParameterException(AnonymousClass008.A0N(AnonymousClass008.A0S("IV must be "), i10, " bytes long."));
                }
            } else {
                String str = this.A02;
                if (str != null && str.equals("ECB")) {
                    throw new InvalidAlgorithmParameterException("ECB mode does not use an IV");
                }
            }
            if (this.A00 != 0 && !(r2 instanceof C11550gV) && !(r2 instanceof C11720gq)) {
                if (secureRandom == null) {
                    secureRandom2 = new SecureRandom();
                } else {
                    secureRandom2 = secureRandom;
                }
                if (i == 1 || i == 3) {
                    byte[] bArr = new byte[this.A00];
                    secureRandom2.nextBytes(bArr);
                    C11550gV r02 = new C11550gV(r2, bArr);
                    this.A07 = r02;
                    r2 = r02;
                } else if (this.A08.A9X().A4i().indexOf("PGPCFB") < 0) {
                    throw new InvalidAlgorithmParameterException("no IV set when one expected");
                }
            }
            if (secureRandom != null && this.A0A) {
                r2 = new C73323Wj(r2, secureRandom);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            try {
                                StringBuilder sb = new StringBuilder();
                                sb.append("unknown opmode ");
                                sb.append(i);
                                sb.append(" passed");
                                throw new InvalidParameterException(sb.toString());
                            } catch (Exception e) {
                                throw new C68043Bm(this, e.getMessage(), e);
                            }
                        }
                    }
                }
                this.A08.AAX(false, r2);
                return;
            }
            this.A08.AAX(true, r2);
        } else {
            throw new InvalidAlgorithmParameterException("RC5 requires an RC5ParametersSpec to be passed in.");
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        String A002 = C68093Br.A00(str);
        this.A02 = A002;
        if (A002.equals("ECB")) {
            this.A00 = 0;
            this.A08 = new C73343Wy(this.A05);
        } else if (A002.equals("CBC")) {
            AbstractC11690gn r2 = this.A05;
            this.A00 = r2.A4x();
            this.A08 = new C73343Wy(new C73303Wh(r2));
        } else if (A002.startsWith("OFB")) {
            AbstractC11690gn r22 = this.A05;
            int A4x = r22.A4x();
            this.A00 = A4x;
            if (A002.length() != 3) {
                this.A08 = new C73343Wy(new C74443at(this.A05, Integer.parseInt(A002.substring(3))));
                return;
            }
            this.A08 = new C73343Wy(new C74443at(r22, A4x << 3));
        } else if (A002.startsWith("CFB")) {
            AbstractC11690gn r23 = this.A05;
            int A4x2 = r23.A4x();
            this.A00 = A4x2;
            if (A002.length() != 3) {
                this.A08 = new C73343Wy(new C74433as(this.A05, Integer.parseInt(A002.substring(3))));
                return;
            }
            this.A08 = new C73343Wy(new C74433as(r23, A4x2 << 3));
        } else if (A002.startsWith("CTR")) {
            AbstractC11690gn r1 = this.A05;
            this.A00 = r1.A4x();
            this.A09 = false;
            this.A08 = new C73343Wy(new C67953Bd(new C74453au(r1)));
        } else if (A002.startsWith("GCM")) {
            AbstractC11690gn r24 = this.A05;
            this.A00 = r24.A4x();
            this.A08 = new C73333Wx(new C11700go(r24));
        } else {
            throw new NoSuchAlgorithmException(AnonymousClass008.A0K("can't support mode ", str));
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) {
        String A002 = C68093Br.A00(str);
        if (A002.equals("NOPADDING")) {
            AbstractC68053Bn r1 = this.A08;
            if (r1.ARK()) {
                this.A08 = new C73343Wy(new C67953Bd(r1.A9X()));
                return;
            }
            return;
        }
        this.A0A = true;
        if (A00(this.A02)) {
            throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
        } else if (A002.equals("PKCS5PADDING") || A002.equals("PKCS7PADDING")) {
            this.A08 = new C73343Wy(this.A08.A9X());
        } else {
            throw new NoSuchPaddingException(AnonymousClass008.A0L("Padding ", str, " unknown."));
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        AbstractC68053Bn r2 = this.A08;
        if (r2.A9Z(i2) + i3 <= bArr2.length) {
            try {
                return r2.AMA(bArr, i, i2, bArr2, i3);
            } catch (C67983Bg e) {
                throw new IllegalStateException(e.toString());
            }
        } else {
            throw new ShortBufferException("output buffer too short for input.");
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        AbstractC68053Bn r1 = this.A08;
        int A9Z = r1.A9Z(i2);
        if (A9Z > 0) {
            byte[] bArr2 = new byte[A9Z];
            int AMA = r1.AMA(bArr, i, i2, bArr2, 0);
            if (AMA == 0) {
                return null;
            }
            if (AMA == A9Z) {
                return bArr2;
            }
            byte[] bArr3 = new byte[AMA];
            System.arraycopy(bArr2, 0, bArr3, 0, AMA);
            return bArr3;
        }
        r1.AMA(bArr, i, i2, null, 0);
        return null;
    }

    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        engineUpdateAAD(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    public void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.A08.AQp(bArr, i, i2);
    }
}
