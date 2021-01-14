package com.google.android.search.verification.api;

import X.AnonymousClass11q;
import X.AnonymousClass11r;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface ISearchActionVerificationService extends IInterface {
    int getVersion();

    boolean isSearchAction(Intent intent, Bundle bundle);

    public abstract class Stub extends AnonymousClass11r implements ISearchActionVerificationService {
        public static final String DESCRIPTOR = "com.google.android.search.verification.api.ISearchActionVerificationService";
        public static final int TRANSACTION_getVersion = 2;
        public static final int TRANSACTION_isSearchAction = 1;

        public class Proxy extends AnonymousClass11q implements ISearchActionVerificationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.search.verification.api.ISearchActionVerificationService
            public int getVersion() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.search.verification.api.ISearchActionVerificationService
            public boolean isSearchAction(Intent intent, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                if (intent == null) {
                    obtainAndWriteInterfaceToken.writeInt(0);
                } else {
                    obtainAndWriteInterfaceToken.writeInt(1);
                    intent.writeToParcel(obtainAndWriteInterfaceToken, 0);
                }
                boolean z = true;
                if (bundle == null) {
                    obtainAndWriteInterfaceToken.writeInt(0);
                } else {
                    obtainAndWriteInterfaceToken.writeInt(1);
                    bundle.writeToParcel(obtainAndWriteInterfaceToken, 0);
                }
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                if (transactAndReadException.readInt() == 0) {
                    z = false;
                }
                transactAndReadException.recycle();
                return z;
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISearchActionVerificationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface instanceof ISearchActionVerificationService) {
                return (ISearchActionVerificationService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // X.AnonymousClass11r
        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            Parcelable parcelable;
            Parcelable parcelable2;
            if (i == 1) {
                Parcelable.Creator creator = Intent.CREATOR;
                if (parcel.readInt() == 0) {
                    parcelable = null;
                } else {
                    parcelable = (Parcelable) creator.createFromParcel(parcel);
                }
                Intent intent = (Intent) parcelable;
                Parcelable.Creator creator2 = Bundle.CREATOR;
                if (parcel.readInt() == 0) {
                    parcelable2 = null;
                } else {
                    parcelable2 = (Parcelable) creator2.createFromParcel(parcel);
                }
                boolean isSearchAction = isSearchAction(intent, (Bundle) parcelable2);
                parcel2.writeNoException();
                parcel2.writeInt(isSearchAction ? 1 : 0);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int version = getVersion();
                parcel2.writeNoException();
                parcel2.writeInt(version);
                return true;
            }
        }
    }
}
