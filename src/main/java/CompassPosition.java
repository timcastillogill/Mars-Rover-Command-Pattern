public enum CompassPosition {
	NORTH("North", "West", "East"),
	EAST("East", "South", "North"),
	SOUTH("South", "East", "West"),
	WEST("West", "South", "North"),
	;

	private String current;
	private String left;
	private String right;

	CompassPosition(String current, String left, String right) {
		this.current = current;
		this.left = left;
		this.right = right;
	}

	public CompassPosition leftOf() {
		return getDirectionToThe(left);
	}

	public CompassPosition rightOf() {
		return getDirectionToThe(right);
	}

	private CompassPosition getDirectionToThe(String nextDirection) {
		for (CompassPosition compassPosition : values()) {
			if (compassPosition.current.equals(nextDirection)) {
				return compassPosition;
			}
		}
		return null;
	}

}
