package ru.netology.statistic;
public class Radio {
    public int currentStation;
    public int currentVolume;

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 0) {
            newCurrentStation = newCurrentStation;
        }
    }

    public void nextStation() {
        if (currentStation <= 9) {
            currentStation = currentStation + 1;
        }
    }

    public void setPreviousStation() {
        if (currentStation <= 9) {
            currentStation = currentStation - 1;
        }
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextVolumeMax() {
        if (currentVolume <= 10) {
            currentVolume = currentVolume;
        }
    }

    public void setPreviousVolumeMin() {
        if (currentStation <= 0) {
            currentVolume = currentVolume;
        }
    }

    public void nextVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setPreviousVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
    }
}