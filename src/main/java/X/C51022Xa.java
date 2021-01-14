package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Xa  reason: invalid class name and case insensitive filesystem */
public class C51022Xa extends AbstractC16300pa {
    public List A00 = new ArrayList();
    public List A01 = new ArrayList();
    public List A02;
    public List A03 = new ArrayList();
    public boolean A04 = false;
    public final AnonymousClass2XZ A05;
    public final AnonymousClass01X A06;
    public final C02430Bz A07;
    public final C015808q A08;
    public final AnonymousClass0C4 A09;

    public C51022Xa(AnonymousClass2XZ r2, AnonymousClass0C4 r3, AnonymousClass01X r4, C015808q r5, C02430Bz r6) {
        this.A05 = r2;
        this.A09 = r3;
        this.A06 = r4;
        this.A08 = r5;
        this.A07 = r6;
        A08();
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A02.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new AnonymousClass2XV(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.linked_devices_header_layout, viewGroup, false), this.A05);
        } else if (i == 2) {
            return new AnonymousClass2XU(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.device_section_layout, viewGroup, false));
        } else {
            if (i == 3) {
                return new AnonymousClass2XW(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.linked_device_list_item_layout, viewGroup, false), this.A06, this.A05);
            } else if (i == 4) {
                return new C58802mY(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.linked_device_list_item_layout, viewGroup, false), this.A09, this.A06, this.A05);
            } else if (i == 5) {
                return new C58792mX(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.linked_device_list_item_layout, viewGroup, false), this.A06, this.A05);
            } else {
                throw new UnsupportedOperationException(AnonymousClass008.A0F("Invalid viewType: ", i));
            }
        }
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r13, int i) {
        CharSequence A1E;
        CharSequence A1E2;
        CharSequence A1E3;
        if (r13 instanceof C58802mY) {
            C58802mY r132 = (C58802mY) r13;
            AnonymousClass0K4 r5 = (AnonymousClass0K4) ((AnonymousClass2FC) this.A02.get(i)).A01;
            ((AnonymousClass2XW) r132).A00.setImageResource(C28051Sr.A0A(r5));
            boolean A0J = r132.A00.A0J(r5.A0I);
            TextView textView = ((AnonymousClass2XW) r132).A03;
            AnonymousClass01X r2 = ((AnonymousClass2XW) r132).A05;
            long j = r5.A05;
            if (A0J) {
                A1E3 = r2.A06(R.string.linked_device_active_now);
            } else {
                A1E3 = C002001d.A1E(r2, j);
            }
            textView.setText(A1E3);
            ((AnonymousClass2XW) r132).A02.setText(C28051Sr.A11(r5, r2));
            r132.A0H.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(r132, r5, 22));
        } else if (r13 instanceof C58792mX) {
            AnonymousClass2XW r133 = (AnonymousClass2XW) r13;
            C28741Vo r4 = (C28741Vo) ((AnonymousClass2FC) this.A02.get(i)).A01;
            r133.A00.setImageResource(r4.A00);
            TextView textView2 = r133.A03;
            AnonymousClass01X r3 = r133.A05;
            long j2 = r4.A02;
            if (System.currentTimeMillis() - j2 <= 30000) {
                A1E2 = r3.A06(R.string.linked_device_active_now);
            } else {
                A1E2 = C002001d.A1E(r3, j2);
            }
            textView2.setText(A1E2);
            TextView textView3 = r133.A02;
            View view = r133.A0H;
            textView3.setText(view.getContext().getText(r4.A01));
            view.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(r133, r4, 20));
        } else {
            int i2 = 8;
            if (r13 instanceof AnonymousClass2XW) {
                AnonymousClass2XO r22 = (AnonymousClass2XO) ((AnonymousClass2FC) this.A02.get(i)).A01;
                AnonymousClass2XW r134 = (AnonymousClass2XW) r13;
                boolean contains = this.A07.A0J.contains(r22.A05);
                ImageView imageView = r134.A00;
                imageView.setImageResource(C28051Sr.A06(r22));
                TextView textView4 = r134.A02;
                AnonymousClass01X r8 = r134.A05;
                textView4.setText(C28051Sr.A0x(r22, r8));
                boolean z = false;
                if (r22.A01 > 0) {
                    z = true;
                }
                if (z) {
                    TextView textView5 = r134.A03;
                    textView5.setText(r8.A06(R.string.linked_device_logged_out));
                    int color = r134.A0H.getResources().getColor(R.color.disabled_text);
                    textView4.setTextColor(color);
                    textView5.setTextColor(color);
                    C28051Sr.A1T(imageView, false);
                } else {
                    TextView textView6 = r134.A03;
                    long j3 = ((AnonymousClass1VI) r22).A00;
                    if (contains) {
                        A1E = r8.A06(R.string.linked_device_active_now);
                    } else {
                        A1E = C002001d.A1E(r8, j3);
                    }
                    textView6.setText(A1E);
                    textView4.setTextColor(textView4.getResources().getColor(R.color.list_item_title_v2));
                    textView6.setTextColor(textView4.getResources().getColor(R.color.list_item_sub_title_v2));
                    C28051Sr.A1T(imageView, true);
                }
                if (r22.A00) {
                    ImageView imageView2 = r134.A01;
                    if (imageView2.getVisibility() == 8) {
                        imageView2.clearAnimation();
                        imageView2.setAlpha(0.0f);
                        imageView2.setVisibility(0);
                        imageView2.animate().alpha(1.0f).setDuration(500).start();
                    }
                } else {
                    ImageView imageView3 = r134.A01;
                    if (imageView3.getVisibility() == 0) {
                        imageView3.clearAnimation();
                        imageView3.animate().alpha(0.0f).setDuration(500).setListener(new AnonymousClass2FB(r134)).start();
                    }
                }
                r134.A0H.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(r134, r22, 21));
            } else if (r13 instanceof AnonymousClass2XV) {
                AnonymousClass2XV r135 = (AnonymousClass2XV) r13;
                boolean A022 = this.A08.A02();
                Group group = r135.A01;
                int i3 = 8;
                if (A022) {
                    i3 = 0;
                }
                group.setVisibility(i3);
                View view2 = r135.A00;
                if (A022) {
                    i2 = 0;
                }
                view2.setVisibility(i2);
                if (A022) {
                    for (int i4 : r135.A01.getReferencedIds()) {
                        AnonymousClass0Q7.A0D(r135.A0H, i4).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(r135, 44));
                    }
                }
            }
        }
    }

    public final void A08() {
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        arrayList.add(new AnonymousClass2FC(new Object(), 1));
        if (!this.A00.isEmpty() || !this.A03.isEmpty()) {
            this.A02.add(new AnonymousClass2FC(null, 2));
        }
        this.A04 = false;
        for (AnonymousClass1VI r3 : this.A00) {
            this.A02.add(new AnonymousClass2FC(r3, 3));
            String str = r3.A07;
            if (str != null && str.equals("Portal")) {
                this.A04 = true;
            }
        }
        for (AnonymousClass0K4 r32 : this.A03) {
            this.A02.add(new AnonymousClass2FC(r32, 4));
            if (r32.A0D) {
                this.A04 = true;
            }
        }
        for (Object obj : this.A01) {
            this.A02.add(new AnonymousClass2FC(obj, 5));
        }
    }
}
