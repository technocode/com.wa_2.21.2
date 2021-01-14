package X;

import com.whatsapp.stickers.WebpUtils;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2cF  reason: invalid class name and case insensitive filesystem */
public class C53002cF implements AbstractC03430Gf {
    public static volatile C53002cF A08;
    public final AnonymousClass0B3 A00;
    public final C000300f A01;
    public final AnonymousClass00G A02;
    public final C02590Cr A03;
    public final AnonymousClass0D1 A04;
    public final WebpUtils A05;
    public final Map A06 = new ConcurrentHashMap();
    public final Map A07;

    public C53002cF(AnonymousClass00G r5, WebpUtils webpUtils, C02590Cr r7, C000300f r8, AnonymousClass0D1 r9, AnonymousClass0B3 r10) {
        this.A02 = r5;
        this.A05 = webpUtils;
        this.A03 = r7;
        this.A01 = r8;
        this.A04 = r9;
        this.A00 = r10;
        List A012 = C48542Mr.A01(false);
        Iterator it = ((AbstractCollection) A012).iterator();
        while (it.hasNext()) {
            AbstractC48432Mf r2 = (AbstractC48432Mf) it.next();
            this.A06.put(r2.A9J(), r2);
        }
        this.A07 = new ConcurrentHashMap();
    }

    @Override // X.AbstractC03430Gf
    public AnonymousClass2QD A3H(Object obj, float f) {
        return new C52992cE((AbstractC48432Mf) obj, Float.valueOf(f));
    }

    @Override // X.AbstractC03430Gf
    public Object A6b(String str) {
        Object obj = this.A06.get(str);
        return obj == null ? this.A07.get(str) : obj;
    }

    @Override // X.AbstractC03430Gf
    public String A70(Object obj) {
        return ((AbstractC48432Mf) obj).A9J();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0163, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0167, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x002f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC03430Gf
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List AAW() {
        /*
        // Method dump skipped, instructions count: 382
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53002cF.AAW():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        throw r0;
     */
    @Override // X.AbstractC03430Gf
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AM3(java.util.List r7) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53002cF.AM3(java.util.List):void");
    }
}
