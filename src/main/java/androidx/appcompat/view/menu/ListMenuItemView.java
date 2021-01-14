package androidx.appcompat.view.menu;

import X.AbstractC13070jY;
import X.AnonymousClass0T3;
import X.AnonymousClass0TL;
import X.AnonymousClass1ZT;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

public class ListMenuItemView extends LinearLayout implements AbstractC13070jY, AbsListView.SelectionBoundsAdjuster {
    public int A00;
    public Context A01;
    public Drawable A02;
    public Drawable A03;
    public LayoutInflater A04;
    public CheckBox A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public LinearLayout A09;
    public RadioButton A0A;
    public TextView A0B;
    public TextView A0C;
    public AnonymousClass1ZT A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass0TL A002 = AnonymousClass0TL.A00(getContext(), attributeSet, AnonymousClass0T3.A0S, R.attr.listMenuViewStyle);
        this.A02 = A002.A02(5);
        TypedArray typedArray = A002.A02;
        this.A00 = typedArray.getResourceId(1, -1);
        this.A0G = typedArray.getBoolean(7, false);
        this.A01 = context;
        this.A03 = A002.A02(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.A0F = obtainStyledAttributes.hasValue(0);
        typedArray.recycle();
        obtainStyledAttributes.recycle();
    }

    public final void A00() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.A05 = checkBox;
        LinearLayout linearLayout = this.A09;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public final void A01() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.A0A = radioButton;
        LinearLayout linearLayout = this.A09;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r1 == 0) goto L_0x0035;
     */
    @Override // X.AbstractC13070jY
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AAn(X.AnonymousClass1ZT r4, int r5) {
        /*
            r3 = this;
            r3.A0D = r4
            boolean r1 = r4.isVisible()
            r0 = 8
            if (r1 == 0) goto L_0x000b
            r0 = 0
        L_0x000b:
            r3.setVisibility(r0)
            r0 = 0
            if (r0 == 0) goto L_0x0060
            java.lang.CharSequence r0 = r4.getTitleCondensed()
        L_0x0015:
            r3.setTitle(r0)
            boolean r0 = r4.isCheckable()
            r3.setCheckable(r0)
            X.0T8 r2 = r4.A0E
            r1 = r2
            boolean r0 = r2 instanceof X.AnonymousClass0TY
            if (r0 != 0) goto L_0x0057
            boolean r0 = r2.A0K
        L_0x0028:
            if (r0 == 0) goto L_0x0035
            boolean r0 = r2.A0H()
            if (r0 == 0) goto L_0x0054
            char r1 = r4.A00
        L_0x0032:
            r0 = 1
            if (r1 != 0) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            r3.setShortcut(r0)
            android.graphics.drawable.Drawable r0 = r4.getIcon()
            r3.setIcon(r0)
            boolean r0 = r4.isEnabled()
            r3.setEnabled(r0)
            boolean r0 = r4.hasSubMenu()
            r3.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r0 = r4.A0H
            r3.setContentDescription(r0)
            return
        L_0x0054:
            char r1 = r4.A01
            goto L_0x0032
        L_0x0057:
            X.0TY r1 = (X.AnonymousClass0TY) r1
            X.0T8 r0 = r1.A00
            boolean r0 = r0.A0I()
            goto L_0x0028
        L_0x0060:
            java.lang.CharSequence r0 = r4.A0I
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.AAn(X.1ZT, int):void");
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.A06;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A06.getLayoutParams();
            rect.top = this.A06.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.A04;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        this.A04 = from;
        return from;
    }

    @Override // X.AbstractC13070jY
    public AnonymousClass1ZT getItemData() {
        return this.A0D;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.A02);
        TextView textView = (TextView) findViewById(R.id.title);
        this.A0C = textView;
        int i = this.A00;
        if (i != -1) {
            textView.setTextAppearance(this.A01, i);
        }
        this.A0B = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.A08 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.A03);
        }
        this.A06 = (ImageView) findViewById(R.id.group_divider);
        this.A09 = (LinearLayout) findViewById(R.id.content);
    }

    public void onMeasure(int i, int i2) {
        if (this.A07 != null && this.A0G) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.A07.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CheckBox checkBox;
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.A0A != null || this.A05 != null) {
            if ((this.A0D.A02 & 4) != 0) {
                if (this.A0A == null) {
                    A01();
                }
                CompoundButton compoundButton3 = this.A0A;
                CompoundButton compoundButton4 = this.A05;
                checkBox = compoundButton4;
                compoundButton2 = compoundButton4;
                compoundButton = compoundButton3;
            } else {
                if (this.A05 == null) {
                    A00();
                }
                CompoundButton compoundButton5 = this.A05;
                checkBox = compoundButton5;
                compoundButton2 = this.A0A;
                compoundButton = compoundButton5;
            }
            if (z) {
                compoundButton.setChecked(this.A0D.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                    return;
                }
                return;
            }
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.A0A;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.A0D.A02 & 4) != 0) {
            if (this.A0A == null) {
                A01();
            }
            compoundButton = this.A0A;
        } else {
            if (this.A05 == null) {
                A00();
            }
            compoundButton = this.A05;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.A0E = z;
        this.A0G = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r3 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setGroupDividerEnabled(boolean r3) {
        /*
            r2 = this;
            android.widget.ImageView r1 = r2.A06
            if (r1 == 0) goto L_0x0010
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x000b
            r0 = 0
            if (r3 != 0) goto L_0x000d
        L_0x000b:
            r0 = 8
        L_0x000d:
            r1.setVisibility(r0)
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setGroupDividerEnabled(boolean):void");
    }

    public void setIcon(Drawable drawable) {
        boolean z = true;
        if (!this.A0E) {
            z = false;
            if (!this.A0G) {
                return;
            }
        }
        ImageView imageView = this.A07;
        if (imageView != null || drawable != null || this.A0G) {
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.A07 = imageView2;
                LinearLayout linearLayout = this.A09;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable != null || this.A0G) {
                ImageView imageView3 = this.A07;
                if (!z) {
                    drawable = null;
                }
                imageView3.setImageDrawable(drawable);
                if (this.A07.getVisibility() != 0) {
                    this.A07.setVisibility(0);
                    return;
                }
                return;
            }
            this.A07.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r2 == 0) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setShortcut(boolean r11) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setShortcut(boolean):void");
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.A08;
        if (imageView != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.A0C.setText(charSequence);
            if (this.A0C.getVisibility() != 0) {
                this.A0C.setVisibility(0);
            }
        } else if (this.A0C.getVisibility() != 8) {
            this.A0C.setVisibility(8);
        }
    }
}
