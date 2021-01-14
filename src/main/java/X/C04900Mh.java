package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.facebook.animated.gif.GifImage;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0Mh  reason: invalid class name and case insensitive filesystem */
public class C04900Mh extends AbstractC04880Me {
    public static final C20490wn A04;
    public static final C20490wn A05;
    public static final ExecutorService A06 = Executors.newSingleThreadExecutor();
    public static final AtomicBoolean A07 = new AtomicBoolean(false);
    public final ParcelFileDescriptor A00;
    public final GifImage A01;
    public final C20390wd A02;
    public final C32831fg A03;

    static {
        C20500wo r1 = new C20500wo();
        r1.A00 = 4096;
        r1.A03 = true;
        A05 = new C20490wn(r1);
        C20500wo r12 = new C20500wo();
        r12.A00 = 4096;
        A04 = new C20490wn(r12);
    }

    public C04900Mh(ParcelFileDescriptor parcelFileDescriptor, C32831fg r8, GifImage gifImage) {
        this.A00 = parcelFileDescriptor;
        this.A03 = r8;
        this.A01 = gifImage;
        this.A02 = new C20390wd(new C32691fQ(new C20400we(), new C20340wY(gifImage), new Rect(0, 0, gifImage.getWidth(), this.A01.getHeight()), false), new C56842jH(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0092 A[SYNTHETIC, Splitter:B:45:0x0092] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C04900Mh A01(android.os.ParcelFileDescriptor r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04900Mh.A01(android.os.ParcelFileDescriptor, boolean):X.0Mh");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C04890Mf A02(android.os.ParcelFileDescriptor r4) {
        /*
            r0 = 1
            X.0Mh r4 = A01(r4, r0)
            com.facebook.animated.gif.GifImage r0 = r4.A01     // Catch:{ all -> 0x001c }
            int r3 = r0.getWidth()     // Catch:{ all -> 0x001c }
            int r2 = r0.getHeight()     // Catch:{ all -> 0x001c }
            boolean r1 = r0.isAnimated()     // Catch:{ all -> 0x001c }
            X.0Mf r0 = new X.0Mf     // Catch:{ all -> 0x001c }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x001c }
            r4.close()
            return r0
        L_0x001c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0022 }
        L_0x0022:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04900Mh.A02(android.os.ParcelFileDescriptor):X.0Mf");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r1 != null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C04890Mf A03(java.io.File r1) {
        /*
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r1 = android.os.ParcelFileDescriptor.open(r1, r0)
            X.0Mf r0 = A02(r1)     // Catch:{ all -> 0x0010 }
            if (r1 == 0) goto L_0x000f
            r1.close()
        L_0x000f:
            return r0
        L_0x0010:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r0 = move-exception
            if (r1 == 0) goto L_0x0018
            r1.close()     // Catch:{ all -> 0x0018 }
        L_0x0018:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04900Mh.A03(java.io.File):X.0Mf");
    }

    public C20250wO A04(Context context) {
        boolean z;
        C32681fP r10;
        C20340wY r9;
        AbstractC20220wL r13;
        C32601fG r1;
        AbstractC20420wg r0;
        AbstractC32941fr r02;
        synchronized (C20570wv.class) {
            z = false;
            if (C20570wv.A06 != null) {
                z = true;
            }
        }
        C32611fH r3 = null;
        if (!z) {
            C20530wr r12 = new C20530wr(context.getApplicationContext());
            r12.A02 = 1;
            C20540ws r7 = new C20540ws(r12);
            synchronized (C20570wv.class) {
                if (C20570wv.A06 != null) {
                    C19960vt.A00.A00(5, C20570wv.class.getSimpleName(), "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                }
                C20570wv.A06 = new C20570wv(r7);
            }
            C20580ww.A00 = false;
        }
        C20570wv r8 = C20570wv.A06;
        if (r8 != null) {
            if (r8.A00 == null) {
                if (r8.A01 == null) {
                    C20780xH r132 = r8.A05.A08;
                    if (r8.A03 == null) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 26) {
                            int i2 = r132.A08.A03.A00;
                            r02 = new AnonymousClass253(r132.A00(), i2, new C30101aj(i2));
                        } else if (i >= 21 || !C20580ww.A00) {
                            int i3 = r132.A08.A03.A00;
                            r02 = new AnonymousClass252(r132.A00(), i3, new C30101aj(i3));
                        } else {
                            try {
                                Constructor<?> constructor = Class.forName("com.facebook.imagepipeline.platform.KitKatPurgeableDecoder").getConstructor(C20710xA.class);
                                Object[] objArr = new Object[1];
                                C20710xA r92 = r132.A02;
                                if (r92 == null) {
                                    C20770xG r03 = r132.A08;
                                    r92 = new C20710xA(r03.A01, r03.A03);
                                    r132.A02 = r92;
                                }
                                objArr[0] = r92;
                                r02 = (AbstractC32941fr) constructor.newInstance(objArr);
                            } catch (ClassNotFoundException e) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e);
                            } catch (IllegalAccessException e2) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
                            } catch (NoSuchMethodException e3) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
                            } catch (InvocationTargetException e4) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
                            } catch (InstantiationException e5) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e5);
                            }
                        }
                        r8.A03 = r02;
                    }
                    AbstractC32941fr r102 = r8.A03;
                    C20510wp r93 = r8.A04;
                    if (Build.VERSION.SDK_INT >= 21) {
                        r0 = new C32721fT(r132.A00(), r93);
                    } else {
                        int i4 = !C20580ww.A00 ? 1 : 0;
                        C20740xD r04 = r132.A07;
                        if (r04 == null) {
                            AbstractC461428g A012 = r132.A01(i4);
                            String A0F = AnonymousClass008.A0F("failed to get pool for chunk type: ", i4);
                            if (A012 != null) {
                                AbstractC461428g A013 = r132.A01(i4);
                                if (r132.A00 == null) {
                                    if (r132.A03 == null) {
                                        C20770xG r05 = r132.A08;
                                        r132.A03 = new C461228e(r05.A01, r05.A05, r05.A08);
                                    }
                                    r132.A00 = new C20010vy();
                                }
                                r04 = new C20740xD(A013);
                                r132.A07 = r04;
                            } else {
                                throw new NullPointerException(String.valueOf(A0F));
                            }
                        }
                        r0 = new C32731fV(new C20410wf(r04), r102, r93);
                    }
                    r8.A01 = r0;
                }
                AbstractC20420wg r11 = r8.A01;
                C20540ws r06 = r8.A05;
                AbstractC20520wq r103 = r06.A05;
                C32791fb r94 = r8.A02;
                if (r94 == null) {
                    r94 = new C32791fb(new C32751fX(), r06.A02);
                    r8.A02 = r94;
                }
                if (!C20350wZ.A01) {
                    try {
                        C20350wZ.A00 = (AnimatedFactoryV2Impl) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(AbstractC20420wg.class, AbstractC20520wq.class, C32791fb.class, Boolean.TYPE).newInstance(r11, r103, r94, false);
                    } catch (Throwable unused) {
                    }
                    if (C20350wZ.A00 != null) {
                        C20350wZ.A01 = true;
                    }
                }
                r8.A00 = C20350wZ.A00;
            }
            AnimatedFactoryV2Impl animatedFactoryV2Impl = r8.A00;
            if (animatedFactoryV2Impl == null) {
                r10 = null;
            } else {
                r10 = animatedFactoryV2Impl.A01;
                if (r10 == null) {
                    C32651fL r17 = new C32651fL();
                    ExecutorServiceC32461ez r133 = new ExecutorServiceC32461ez(animatedFactoryV2Impl.A05.A4M());
                    C32661fM r18 = new C32661fM();
                    C32671fN r112 = animatedFactoryV2Impl.A00;
                    if (r112 == null) {
                        r112 = new C32671fN(animatedFactoryV2Impl);
                        animatedFactoryV2Impl.A00 = r112;
                    }
                    C32471f0 r122 = C32471f0.A00;
                    if (r122 == null) {
                        r122 = new C32471f0();
                        C32471f0.A00 = r122;
                    }
                    r10 = new C32681fP(r112, r122, r133, RealtimeSinceBootClock.A00, animatedFactoryV2Impl.A03, animatedFactoryV2Impl.A04, r17, r18);
                    animatedFactoryV2Impl.A01 = r10;
                }
            }
            if (r10 != null) {
                C32831fg r5 = this.A03;
                synchronized (r5) {
                    r9 = r5.A00;
                }
                AbstractC20320wW r07 = r9.A00;
                Rect rect = new Rect(0, 0, r07.getWidth(), r07.getHeight());
                AnimatedFactoryV2Impl animatedFactoryV2Impl2 = r10.A03.A00;
                C20400we r72 = animatedFactoryV2Impl2.A02;
                if (r72 == null) {
                    r72 = new C20400we();
                    animatedFactoryV2Impl2.A02 = r72;
                }
                C32691fQ r52 = new C32691fQ(r72, r9, rect, animatedFactoryV2Impl2.A06);
                int intValue = ((Number) r10.A00.get()).intValue();
                if (intValue == 1) {
                    r9.hashCode();
                    r13 = new C32571fD(new C20360wa(new C32561fC(), r10.A05), true);
                } else if (intValue == 2) {
                    r9.hashCode();
                    r13 = new C32571fD(new C20360wa(new C32561fC(), r10.A05), false);
                } else if (intValue != 3) {
                    r13 = new C32591fF();
                } else {
                    r13 = new C32581fE();
                }
                C32641fK r6 = new C32641fK(r13, r52);
                int intValue2 = ((Number) r10.A01.get()).intValue();
                if (intValue2 > 0) {
                    r3 = new C32611fH(intValue2);
                    r1 = new C32601fG(r10.A04, r6, Bitmap.Config.ARGB_8888, r10.A06);
                } else {
                    r1 = null;
                }
                C454824z r113 = new C454824z(r10.A04, r13, new C32621fI(r52), r6, r3, r1);
                return new C20250wO(new C460828a(r113, r113, r10.A02, r10.A07));
            }
            throw new IOException("Failed to create gif drawable, no drawable factory");
        }
        throw new NullPointerException("ImagePipelineFactory was not initialized!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A01.dispose();
        C006803i.A0Z(this.A03);
        ParcelFileDescriptor parcelFileDescriptor = this.A00;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
    }
}
