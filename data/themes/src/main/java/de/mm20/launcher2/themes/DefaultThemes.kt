package de.mm20.launcher2.themes

import java.util.UUID


val DefaultThemeId = UUID(0L, 0L)

val DefaultLightColorScheme = ColorScheme<Color>(
    primary = ColorRef(CorePaletteColor.Primary, 40),
    onPrimary = ColorRef(CorePaletteColor.Primary, 100),
    primaryContainer = ColorRef(CorePaletteColor.Primary, 90),
    onPrimaryContainer = ColorRef(CorePaletteColor.Primary, 10),
    secondary = ColorRef(CorePaletteColor.Secondary, 40),
    onSecondary = ColorRef(CorePaletteColor.Secondary, 100),
    secondaryContainer = ColorRef(CorePaletteColor.Secondary, 90),
    onSecondaryContainer = ColorRef(CorePaletteColor.Secondary, 10),
    tertiary = ColorRef(CorePaletteColor.Tertiary, 40),
    onTertiary = ColorRef(CorePaletteColor.Tertiary, 100),
    tertiaryContainer = ColorRef(CorePaletteColor.Tertiary, 90),
    onTertiaryContainer = ColorRef(CorePaletteColor.Tertiary, 10),
    error = ColorRef(CorePaletteColor.Error, 40),
    onError = ColorRef(CorePaletteColor.Error, 100),
    errorContainer = ColorRef(CorePaletteColor.Error, 90),
    onErrorContainer = ColorRef(CorePaletteColor.Error, 10),
    surfaceDim = ColorRef(CorePaletteColor.Neutral, 87),
    surface = ColorRef(CorePaletteColor.Neutral, 98),
    surfaceBright = ColorRef(CorePaletteColor.Neutral, 98),
    surfaceContainerLowest = ColorRef(CorePaletteColor.Neutral, 100),
    surfaceContainerLow = ColorRef(CorePaletteColor.Neutral, 96),
    surfaceContainer = ColorRef(CorePaletteColor.Neutral, 94),
    surfaceContainerHigh = ColorRef(CorePaletteColor.Neutral, 92),
    surfaceContainerHighest = ColorRef(CorePaletteColor.Neutral, 90),
    onSurface = ColorRef(CorePaletteColor.Neutral, 10),
    onSurfaceVariant = ColorRef(CorePaletteColor.NeutralVariant, 30),
    outline = ColorRef(CorePaletteColor.NeutralVariant, 50),
    outlineVariant = ColorRef(CorePaletteColor.NeutralVariant, 80),
    inverseSurface = ColorRef(CorePaletteColor.Neutral, 20),
    inverseOnSurface = ColorRef(CorePaletteColor.Neutral, 95),
    inversePrimary = ColorRef(CorePaletteColor.Primary, 80),
    surfaceVariant = ColorRef(CorePaletteColor.NeutralVariant, 90),
    surfaceTint = ColorRef(CorePaletteColor.Primary, 40),
    background = ColorRef(CorePaletteColor.Neutral, 98),
    onBackground = ColorRef(CorePaletteColor.Neutral, 10),
    scrim = ColorRef(CorePaletteColor.Neutral, 0),
)

val DefaultDarkColorScheme = ColorScheme<Color>(
    primary = ColorRef(CorePaletteColor.Primary, 80),
    onPrimary = ColorRef(CorePaletteColor.Primary, 20),
    primaryContainer = ColorRef(CorePaletteColor.Primary, 30),
    onPrimaryContainer = ColorRef(CorePaletteColor.Primary, 90),
    secondary = ColorRef(CorePaletteColor.Secondary, 80),
    onSecondary = ColorRef(CorePaletteColor.Secondary, 20),
    secondaryContainer = ColorRef(CorePaletteColor.Secondary, 30),
    onSecondaryContainer = ColorRef(CorePaletteColor.Secondary, 90),
    tertiary = ColorRef(CorePaletteColor.Tertiary, 80),
    onTertiary = ColorRef(CorePaletteColor.Tertiary, 20),
    tertiaryContainer = ColorRef(CorePaletteColor.Tertiary, 30),
    onTertiaryContainer = ColorRef(CorePaletteColor.Tertiary, 90),
    error = ColorRef(CorePaletteColor.Error, 80),
    onError = ColorRef(CorePaletteColor.Error, 20),
    errorContainer = ColorRef(CorePaletteColor.Error, 30),
    onErrorContainer = ColorRef(CorePaletteColor.Error, 90),
    surfaceDim = ColorRef(CorePaletteColor.Neutral, 6),
    surface = ColorRef(CorePaletteColor.Neutral, 6),
    surfaceBright = ColorRef(CorePaletteColor.Neutral, 24),
    surfaceContainerLowest = ColorRef(CorePaletteColor.Neutral, 4),
    surfaceContainerLow = ColorRef(CorePaletteColor.Neutral, 10),
    surfaceContainer = ColorRef(CorePaletteColor.Neutral, 12),
    surfaceContainerHigh = ColorRef(CorePaletteColor.Neutral, 17),
    surfaceContainerHighest = ColorRef(CorePaletteColor.Neutral, 22),
    onSurface = ColorRef(CorePaletteColor.Neutral, 90),
    onSurfaceVariant = ColorRef(CorePaletteColor.NeutralVariant, 80),
    outline = ColorRef(CorePaletteColor.NeutralVariant, 60),
    outlineVariant = ColorRef(CorePaletteColor.NeutralVariant, 30),
    inverseSurface = ColorRef(CorePaletteColor.Neutral, 98),
    inverseOnSurface = ColorRef(CorePaletteColor.Neutral, 10),
    inversePrimary = ColorRef(CorePaletteColor.Primary, 40),
    surfaceVariant = ColorRef(CorePaletteColor.NeutralVariant, 30),
    surfaceTint = ColorRef(CorePaletteColor.Primary, 80),
    background = ColorRef(CorePaletteColor.Neutral, 6),
    onBackground = ColorRef(CorePaletteColor.Neutral, 90),
    scrim = ColorRef(CorePaletteColor.Neutral, 0),
)

val BlackAndWhiteThemeId = UUID(0L, 1L)

val BlackAndWhiteLightColorScheme = ColorScheme<Color?>(
    primary = StaticColor(0xFF000000.toInt()),
    onPrimary = StaticColor(0xFFFFFFFF.toInt()),
    primaryContainer = StaticColor(0xFFFFFFFF.toInt()),
    onPrimaryContainer = StaticColor(0xFF000000.toInt()),
    inversePrimary = StaticColor(0xFFFFFFFF.toInt()),
    secondary = StaticColor(0xFF000000.toInt()),
    onSecondary = StaticColor(0xFFFFFFFF.toInt()),
    secondaryContainer = StaticColor(0xFFFFFFFF.toInt()),
    onSecondaryContainer = StaticColor(0xFF000000.toInt()),
    tertiary = StaticColor(0xFF000000.toInt()),
    onTertiary = StaticColor(0xFFFFFFFF.toInt()),
    tertiaryContainer = StaticColor(0xFFFFFFFF.toInt()),
    onTertiaryContainer = StaticColor(0xFF000000.toInt()),
    background = StaticColor(0xFFFFFFFF.toInt()),
    onBackground = StaticColor(0xFF000000.toInt()),
    surface = StaticColor(0xFFFFFFFF.toInt()),
    onSurface = StaticColor(0xFF000000.toInt()),
    surfaceVariant = StaticColor(0xFFFFFFFF.toInt()),
    onSurfaceVariant = StaticColor(0xFF000000.toInt()),
    inverseSurface = StaticColor(0xFF000000.toInt()),
    inverseOnSurface = StaticColor(0xFFFFFFFF.toInt()),
    error = null,
    onError = null,
    errorContainer = null,
    onErrorContainer = null,
    outline = StaticColor(0xFF000000.toInt()),
    surfaceTint = StaticColor(0xFFFFFFFF.toInt()),
    outlineVariant = StaticColor(0xFF000000.toInt()),
    scrim = StaticColor(0xFF000000.toInt()),
    surfaceDim = StaticColor(0xFFFFFFFF.toInt()),
    surfaceBright = StaticColor(0xFFFFFFFF.toInt()),
    surfaceContainer = StaticColor(0xFFFFFFFF.toInt()),
    surfaceContainerHigh = StaticColor(0xFFFFFFFF.toInt()),
    surfaceContainerHighest = StaticColor(0xFFFFFFFF.toInt()),
    surfaceContainerLow = StaticColor(0xFFFFFFFF.toInt()),
    surfaceContainerLowest = StaticColor(0xFFFFFFFF.toInt()),
)

val BlackAndWhiteDarkColorScheme = ColorScheme<Color?>(
    primary = StaticColor(0xFFFFFFFF.toInt()),
    onPrimary = StaticColor(0xFF000000.toInt()),
    primaryContainer = StaticColor(0xFF000000.toInt()),
    onPrimaryContainer = StaticColor(0xFFFFFFFF.toInt()),
    inversePrimary = StaticColor(0xFF000000.toInt()),
    secondary = StaticColor(0xFFFFFFFF.toInt()),
    onSecondary = StaticColor(0xFF000000.toInt()),
    secondaryContainer = StaticColor(0xFF000000.toInt()),
    onSecondaryContainer = StaticColor(0xFFFFFFFF.toInt()),
    tertiary = StaticColor(0xFFFFFFFF.toInt()),
    onTertiary = StaticColor(0xFF000000.toInt()),
    tertiaryContainer = StaticColor(0xFF000000.toInt()),
    onTertiaryContainer = StaticColor(0xFFFFFFFF.toInt()),
    background = StaticColor(0xFF000000.toInt()),
    onBackground = StaticColor(0xFFFFFFFF.toInt()),
    surface = StaticColor(0xFF000000.toInt()),
    onSurface = StaticColor(0xFFFFFFFF.toInt()),
    surfaceVariant = StaticColor(0xFF000000.toInt()),
    onSurfaceVariant = StaticColor(0xFFFFFFFF.toInt()),
    inverseSurface = StaticColor(0xFFFFFFFF.toInt()),
    inverseOnSurface = StaticColor(0xFF000000.toInt()),
    error = null,
    onError = null,
    errorContainer = null,
    onErrorContainer = null,
    outline = StaticColor(0xFFFFFFFF.toInt()),
    surfaceTint = StaticColor(0xFFFFFFFF.toInt()),
    outlineVariant = StaticColor(0xFFFFFFFF.toInt()),
    scrim = StaticColor(0xFFFFFFFF.toInt()),
    surfaceDim = StaticColor(0xFF000000.toInt()),
    surfaceBright = StaticColor(0xFF000000.toInt()),
    surfaceContainer = StaticColor(0xFF000000.toInt()),
    surfaceContainerHigh = StaticColor(0xFF000000.toInt()),
    surfaceContainerHighest = StaticColor(0xFF000000.toInt()),
    surfaceContainerLow = StaticColor(0xFF000000.toInt()),
    surfaceContainerLowest = StaticColor(0xFF000000.toInt()),
)