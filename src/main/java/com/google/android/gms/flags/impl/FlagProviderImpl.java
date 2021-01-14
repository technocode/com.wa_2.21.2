package com.google.android.gms.flags.impl;

import X.AnonymousClass19B;
import X.AnonymousClass19C;
import X.AnonymousClass19D;
import X.AnonymousClass19E;
import X.AnonymousClass19F;
import X.AnonymousClass19G;
import X.AnonymousClass19H;
import X.AnonymousClass19q;
import X.BinderC04800Lv;
import X.BinderC04810Lw;
import X.C008805h;
import X.C35541kW;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;

public class FlagProviderImpl extends AnonymousClass19q implements AnonymousClass19H {
    public boolean zzu;
    public SharedPreferences zzv;

    public FlagProviderImpl() {
        this(0);
        this.zzu = false;
    }

    public FlagProviderImpl(int i) {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static AnonymousClass19H asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof AnonymousClass19H) {
            return (AnonymousClass19H) queryLocalInterface;
        }
        return new C35541kW(iBinder);
    }

    @Override // X.AnonymousClass19q
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            init(BinderC04810Lw.A01(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            String readString = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                z = true;
            }
            boolean booleanFlagValue = getBooleanFlagValue(readString, z, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
            return true;
        } else if (i == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
            return true;
        } else if (i == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
            return true;
        } else if (i != 5) {
            return false;
        } else {
            String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
            return true;
        }
    }

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        String str2;
        if (!this.zzu) {
            return z;
        }
        SharedPreferences sharedPreferences = this.zzv;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) C008805h.A0d(new AnonymousClass19B(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        String str2;
        if (!this.zzu) {
            return i;
        }
        SharedPreferences sharedPreferences = this.zzv;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) C008805h.A0d(new AnonymousClass19C(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        String str2;
        if (!this.zzu) {
            return j;
        }
        SharedPreferences sharedPreferences = this.zzv;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) C008805h.A0d(new AnonymousClass19D(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.zzu) {
            return str2;
        }
        try {
            return (String) C008805h.A0d(new AnonymousClass19E(this.zzv, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    public void init(IObjectWrapper iObjectWrapper) {
        SharedPreferences sharedPreferences;
        Context context = (Context) BinderC04800Lv.A00(iObjectWrapper);
        if (!this.zzu) {
            try {
                Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
                synchronized (SharedPreferences.class) {
                    sharedPreferences = AnonymousClass19F.A00;
                    if (sharedPreferences == null) {
                        sharedPreferences = (SharedPreferences) C008805h.A0d(new AnonymousClass19G(createPackageContext));
                        AnonymousClass19F.A00 = sharedPreferences;
                    }
                }
                this.zzv = sharedPreferences;
                this.zzu = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
            }
        }
    }
}
