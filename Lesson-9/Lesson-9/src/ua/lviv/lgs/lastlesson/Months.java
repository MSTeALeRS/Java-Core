package ua.lviv.lgs.lastlesson;


public enum Months {
	
		JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 29), MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30),
		MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31),
		SEPTEMBER(Seasons.FALL, 30), OCTOBER(Seasons.FALL, 31), NOVEMBER(Seasons.FALL, 30),
		DECEMBER(Seasons.WINTER, 31);

		Seasons seasons;

		private int monthday;

		Months(Seasons seasons, int monthday) {
			this.seasons = seasons;
			this.monthday = monthday;
		}

		public void setSeasons(Seasons seasons) {
			this.seasons = seasons;
		}

		public Seasons getSeasons() {
			return seasons;
		}

		public int getMonthday() {
			return monthday;
		}

}
