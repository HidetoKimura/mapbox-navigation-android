package com.mapbox.navigation.ui;

import androidx.annotation.Nullable;

import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.navigation.ui.camera.Camera;
import com.mapbox.navigation.ui.puck.PuckDrawableSupplier;

public abstract class NavigationUiOptions {

  public abstract DirectionsRoute directionsRoute();

  @Nullable
  public abstract Integer lightThemeResId();

  @Nullable
  public abstract Integer darkThemeResId();

  public abstract boolean shouldSimulateRoute();

  public abstract boolean waynameChipEnabled();

  @Nullable
  public abstract Camera camera();

  @Nullable
  public abstract PuckDrawableSupplier puckDrawableSupplier();

  public abstract boolean muteVoiceGuidance();

  public abstract boolean isFallbackAlwaysEnabled();
}
