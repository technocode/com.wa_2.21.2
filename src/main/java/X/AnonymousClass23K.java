package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.23K  reason: invalid class name */
public class AnonymousClass23K extends AnonymousClass1ZL implements AbstractC05200No {
    public int A00;
    public int A01;
    public AnonymousClass23J A02;
    public AbstractC12860jC A03;
    public boolean A04;

    public AnonymousClass23K() {
        this(null, null);
    }

    public AnonymousClass23K(AnonymousClass23J r2, Resources resources) {
        this.A01 = -1;
        this.A00 = -1;
        AnonymousClass23J r0 = new AnonymousClass23J(r2, this, resources);
        super.A03(r0);
        this.A02 = r0;
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:92:0x0075 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:46:0x0123 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x01eb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:101:0x0075 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v35, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v50, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v54, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0241, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.toString());
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass23K A00(android.content.Context r25, android.content.res.Resources r26, org.xmlpull.v1.XmlPullParser r27, android.util.AttributeSet r28, android.content.res.Resources.Theme r29) {
        /*
        // Method dump skipped, instructions count: 641
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass23K.A00(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):X.23K");
    }

    @Override // X.AnonymousClass1ZL, X.C12890jF
    public void A03(AbstractC12880jE r2) {
        super.A03(r2);
        if (r2 instanceof AnonymousClass23J) {
            this.A02 = (AnonymousClass23J) r2;
        }
    }

    @Override // X.C12890jF
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC12860jC r0 = this.A03;
        if (r0 != null) {
            r0.A01();
            this.A03 = null;
            A02(this.A01);
            this.A01 = -1;
            this.A00 = -1;
        }
    }

    @Override // X.AnonymousClass1ZL, X.C12890jF
    public Drawable mutate() {
        if (!this.A04) {
            super.mutate();
            if (this == this) {
                this.A02.A04();
                this.A04 = true;
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ee, code lost:
        if (A02(r5) != false) goto L_0x002f;
     */
    @Override // X.AnonymousClass1ZL, X.C12890jF
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r15) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass23K.onStateChange(int[]):boolean");
    }

    @Override // X.C12890jF
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC12860jC r0 = this.A03;
        if (r0 != null && (visible || z2)) {
            if (z) {
                r0.A00();
            } else {
                jumpToCurrentState();
                return visible;
            }
        }
        return visible;
    }
}
