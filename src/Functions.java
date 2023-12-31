class Functions {   
	public static float clamp(float val, float min, float max) {
		return Math.max(min, Math.min(max, val));
	}
	
	public static int wrap(int x, int min, int max) {
		int d = max - min;
		while(x < min) {
			x += d;
		};
		while(x >= max) {
			x -= d;
		};
		return x;
	};

	public static boolean rectCollide(float left1, float top1, float right1, float bottom1, float left2, float top2, float right2, float bottom2) {
		if(((left1 < right2 && left1 >= left2) ||
			(right1 > left2 && right1 <= right2)) &&
			((top1 < bottom2 && top1 >= top2) ||
			(bottom1 > top2 && bottom1 <= bottom2))) {
			return true;
		};
		return false;
	};

	public static double distance(double x1, double y1, double x2, double y2) { //calculates euclidean distance using pythagorean theorom
		double deltaX = Math.abs(x1 - x2);
		double deltaY = Math.abs(y1 - y2);

		return Math.hypot(deltaX, deltaY);
	};
	
	public static double pointPointAngle(float x1, float y1, float x2, float y2) {
		float deltaX = x2 - x1;
		float deltaY = y2 - y1;
      	return Math.atan2(deltaY, deltaX);
    };
};