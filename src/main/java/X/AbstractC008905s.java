package X;

import android.os.Build;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.05s  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC008905s implements AbstractC009005t, AnonymousClass05l, AbstractC009105u, AnonymousClass05o {
    public AnonymousClass07H A00 = new AnonymousClass07H();
    public AnonymousClass05n A01;
    public AbstractC009505y A02;
    public AbstractC009505y A03;
    public Long A04;
    public LinkedList A05;
    public List A06 = new ArrayList();
    public final int A07 = AnonymousClass1GL.A00.incrementAndGet();

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:451:0x0ac2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v44, types: [X.1gt] */
    /* JADX WARN: Type inference failed for: r4v60, types: [X.1dd] */
    /* JADX WARN: Type inference failed for: r4v61, types: [X.1dd] */
    /* JADX WARN: Type inference failed for: r4v62, types: [X.1dd] */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x031e, code lost:
        if (r1 == false) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0382, code lost:
        if (r7 != 1) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04cf, code lost:
        if (r1 == Integer.MIN_VALUE) goto L_0x04d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x0c38  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0W0 A00(X.C07080Vv r38, int r39, int r40) {
        /*
        // Method dump skipped, instructions count: 3226
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC008905s.A00(X.0Vv, int, int):X.0W0");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:172:0x0356 */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r4.A06 != 0.0f) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        if (r1 == X.AnonymousClass11D.A02) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AbstractC07100Vx A01(X.C07080Vv r18) {
        /*
        // Method dump skipped, instructions count: 922
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC008905s.A01(X.0Vv):X.0Vx");
    }

    public AbstractC008905s A02() {
        try {
            AbstractC008905s r2 = (AbstractC008905s) super.clone();
            AnonymousClass05n r1 = this.A01;
            if (r1 instanceof AbstractC009105u) {
                r2.A01 = (AnonymousClass05n) ((AbstractC009105u) r1).ABr();
            }
            List list = r2.A06;
            if (list != null) {
                r2.A06 = new ArrayList(list);
            }
            return r2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("This should not be possible", e);
        }
    }

    public AnonymousClass1Gq A03() {
        if (this instanceof AnonymousClass29V) {
            return C37881ow.A00;
        }
        if (this instanceof AnonymousClass29T) {
            return C37801oo.A00;
        }
        if (this instanceof AnonymousClass2AY) {
            return C37771ol.A01;
        }
        if (this instanceof AnonymousClass2AC) {
            return new C31661db();
        }
        if (this instanceof AnonymousClass2B0) {
            return C43321yB.A00;
        }
        if (this instanceof C46552Az) {
            return AnonymousClass1y9.A00;
        }
        if (this instanceof C46542Ay) {
            return C43311yA.A00;
        }
        if (this instanceof AnonymousClass2Aw) {
            return C43301y8.A00;
        }
        if (this instanceof AnonymousClass2Av) {
            return C43291y7.A00;
        }
        if (this instanceof C46522Au) {
            return C43281y6.A00;
        }
        if (this instanceof C46512At) {
            return AnonymousClass1y5.A00;
        }
        if (this instanceof C46502As) {
            return C43271y4.A00;
        }
        if (this instanceof C46482Aq) {
            return C43261y3.A00;
        }
        if (this instanceof C46472Ap) {
            return C43251y2.A00;
        }
        if (this instanceof C46422Aa) {
            return C37871ov.A00;
        }
        if (!(this instanceof AnonymousClass2AB)) {
            return null;
        }
        return C31651da.A00;
    }

    public void A04() {
        String str;
        if (this instanceof AnonymousClass29V) {
            AnonymousClass29V r1 = (AnonymousClass29V) this;
            AnonymousClass06T r0 = r1.A00;
            if (r0 != null) {
                str = r0.A03;
                r1.A04 = str;
            } else {
                str = r1.A0C;
                r1.A04 = str;
            }
            if (str == null) {
                r1.A04 = "";
            }
        } else if (this instanceof C46422Aa) {
            C46422Aa r2 = (C46422Aa) this;
            r2.A00 = new C25301Gh(r2.A0I);
            r2.A0J = r2.A0I;
        }
    }

    public boolean A05(AbstractC25321Gj r6) {
        if (!(this instanceof AnonymousClass07C)) {
            return r6.AR3(this);
        }
        AnonymousClass07C r4 = (AnonymousClass07C) this;
        if (!r6.AR3(r4)) {
            for (int i = 0; i < r4.A00.size(); i++) {
                if (!((AbstractC008905s) r4.A00.get(i)).A05(r6)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC009005t
    public List A4u() {
        return Collections.singletonList(this.A06);
    }

    @Override // X.AnonymousClass05m
    public int A5J() {
        return this.A07;
    }

    @Override // X.AnonymousClass05k
    public Long A6l() {
        return this.A04;
    }

    @Override // X.AbstractC009005t
    public final AnonymousClass1Gq A8a() {
        return C37921p0.A00;
    }

    @Override // X.AnonymousClass05l
    public View A9i() {
        return this.A00.A07;
    }

    @Override // X.AbstractC009105u
    public /* bridge */ /* synthetic */ AbstractC009105u ABr() {
        if (!(this instanceof AnonymousClass07C)) {
            return A02();
        }
        AnonymousClass07C r1 = (AnonymousClass07C) this;
        if (!(r1 instanceof AnonymousClass2AY)) {
            return r1.A02();
        }
        return ((AnonymousClass2AY) r1).A06();
    }

    @Override // X.AbstractC009005t
    public /* bridge */ /* synthetic */ AbstractC009005t ABs() {
        if (!(this instanceof AnonymousClass07C)) {
            return A02();
        }
        AnonymousClass07C r1 = (AnonymousClass07C) this;
        if (!(r1 instanceof AnonymousClass2AY)) {
            return r1.A02();
        }
        return ((AnonymousClass2AY) r1).A06();
    }

    @Override // X.AnonymousClass05o
    public boolean ANv(String str, AbstractC011306t r10) {
        if (!(this instanceof C46422Aa)) {
            View view = this.A00.A07;
            if (view == null) {
                return false;
            }
            switch (str.hashCode()) {
                case -1225497657:
                    if (str.equals("translationX")) {
                        float floatValue = ((Number) r10).floatValue();
                        this.A00.A04 = floatValue;
                        view.setTranslationX(floatValue);
                        return true;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        float floatValue2 = ((Number) r10).floatValue();
                        this.A00.A05 = floatValue2;
                        view.setTranslationY(floatValue2);
                        return true;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        float floatValue3 = ((Number) r10).floatValue();
                        this.A00.A06 = floatValue3;
                        if (Build.VERSION.SDK_INT >= 21) {
                            view.setTranslationZ(floatValue3);
                        }
                        return true;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        float floatValue4 = ((Number) r10).floatValue();
                        this.A00.A02 = floatValue4;
                        view.setScaleX(floatValue4);
                        return true;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        float floatValue5 = ((Number) r10).floatValue();
                        this.A00.A03 = floatValue5;
                        view.setScaleY(floatValue5);
                        return true;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        float floatValue6 = ((Number) r10).floatValue();
                        this.A00.A01 = floatValue6;
                        view.setRotation(floatValue6);
                        return true;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        float floatValue7 = ((Number) r10).floatValue();
                        this.A00.A00 = floatValue7;
                        view.setAlpha(floatValue7);
                        return true;
                    }
                    break;
            }
            return false;
        }
        C46422Aa r4 = (C46422Aa) this;
        boolean z = false;
        if (str.hashCode() != 3556653 || !str.equals("text")) {
            return false;
        }
        String str2 = (String) C008805h.A0a(r10);
        C25301Gh r1 = r4.A00;
        r1.A0C = str2;
        EditText editText = (EditText) ((AbstractC008905s) r4).A00.A07;
        if (editText != null) {
            TextWatcher textWatcher = r1.A0A;
            if (textWatcher != null) {
                editText.removeTextChangedListener(textWatcher);
            }
            TextWatcher textWatcher2 = r4.A00.A09;
            if (textWatcher2 != null) {
                editText.removeTextChangedListener(textWatcher2);
            }
            int length = editText.getText().length() - editText.getSelectionEnd();
            if (editText.getSelectionEnd() == 0) {
                z = true;
            }
            editText.setText(str2);
            if (!z) {
                int length2 = str2.length();
                editText.setSelection(Math.min(length2 - length, length2));
            }
            TextWatcher textWatcher3 = r4.A00.A0A;
            if (textWatcher3 != null) {
                editText.addTextChangedListener(textWatcher3);
            }
            TextWatcher textWatcher4 = r4.A00.A09;
            if (textWatcher4 != null) {
                editText.addTextChangedListener(textWatcher4);
            }
        }
        return true;
    }
}
