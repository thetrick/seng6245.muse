package api;

public final class Enums {

	public static enum ScaleType {
		
		Sharp,
		Flat,
		NotSet,
		NotApplicable;
				
		@Override
		public String toString() {
			switch(this) {
				case Sharp:
					return "#";
				case Flat:
					return "_";
				case NotSet:
					return "Not Set";
				default:
					return "Not Applicable";
			}
		}
	}
	
	public static enum Key {
		
		Cmajor,
		Gmajor,
		Dmajor,
		Amajor,
		Emajor,
		Bmajor,
		Fsharpmajor,
		Csharpmajor,
		Aminor,
		Eminor,
		Bminor,
		Fsharpminor,
		Csharpminor,
		Gsharpminor,
		Dsharpminor,
		Asharpminor,
		Fmajor,
		Bflatmajor,
		Eflatmajor,
		Aflatmajor,
		Dflatmajor,
		Gflatmajor,
		Cflatmajor,
		Dminor,
		Gminor,
		Cminor,
		Fminor,
		Bflatminor,
		Eflatminor,
		Aflatminor;
		
		@Override
		public String toString() {
			String name = this.name();
			return name.replace("sharp", "#").replace("flat", "_").replace("minor", " minor").replace("major", " major");
		}
		
	}
	
	public static enum Pitches {
		C(0),
		D(1),
		E(2),
		F(3),
		G(4),
		A(5),
		B(6);
		
		private int position;
		
		private Pitches(int position) {
			this.position = position;
		}
		
		public int getPosition() {
			return this.position;
		}
	}
	
	public static enum ScaleNotes {
		Fsharp,
		Csharp,
		Gsharp,
		Dsharp,
		Asharp,
		Esharp,
		Bsharp,
		Bflat,
		Eflat,
		Aflat,
		Dflat,
		Gflat,
		Cflat,
		Fflat;
		
		@Override
		public String toString() {
			String name = this.name();
			return name.replace("sharp", "#").replace("flat", "_");
		}		
	}
	
}
