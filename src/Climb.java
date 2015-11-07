public class Climb {
	String holdType;
	int wallAngle;

	Climb(String holdType, int wallAngle){
		this.holdType = holdType;
		this.wallAngle = wallAngle;
	}

	int wallAngle() {
		return wallAngle;
	}

	void wallAngle(int newWallAngle) {
		wallAngle = wallAngle;
	}

	String holdType() {
		return holdType;
	}

	void holdType(String newholdType) {
		holdType = newholdType;
	}
}
