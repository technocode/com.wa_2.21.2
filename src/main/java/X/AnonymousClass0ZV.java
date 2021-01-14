package X;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: X.0ZV  reason: invalid class name */
public class AnonymousClass0ZV extends Resources {
    public final Resources A00;

    public AnonymousClass0ZV(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.A00 = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i) {
        return this.A00.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) {
        return this.A00.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i) {
        return this.A00.getColor(i);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i) {
        return this.A00.getColorStateList(i);
    }

    public Configuration getConfiguration() {
        return this.A00.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) {
        return this.A00.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) {
        return this.A00.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) {
        return this.A00.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.A00.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i, Resources.Theme theme) {
        return this.A00.getDrawable(i, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2) {
        return this.A00.getDrawableForDensity(i, i2);
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.A00.getDrawableForDensity(i, i2, theme);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.A00.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.A00.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) {
        return this.A00.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) {
        return this.A00.getInteger(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i) {
        return this.A00.getLayout(i);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i) {
        return this.A00.getMovie(i);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2) {
        return this.A00.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.A00.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i, int i2) {
        return this.A00.getQuantityText(i, i2);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i) {
        return this.A00.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i) {
        return this.A00.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i) {
        return this.A00.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i) {
        return this.A00.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public String getString(int i) {
        return this.A00.getString(i);
    }

    @Override // android.content.res.Resources
    public String getString(int i, Object... objArr) {
        return this.A00.getString(i, objArr);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i) {
        return this.A00.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i) {
        return this.A00.getText(i);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.A00.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i) {
        return this.A00.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.A00.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.A00.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.A00.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i) {
        return this.A00.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.A00.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i) {
        return this.A00.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i) {
        return this.A00.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.A00.openRawResource(i, typedValue);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.A00.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.A00.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.A00.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.A00;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
