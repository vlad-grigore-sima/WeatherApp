# WeatherForecast

An experimental weather forecast iOS app built with JetBrains Compose Multiplatform (CMP) to explore:

- Integrating REST APIs ([OpenWeatherMap API](https://www.weatherapi.com))
- Designing and implementing tab bars, navigation stacks, and expandable UI in Compose for iOS
- Transitions and animations in iOS using CMP
- HTTP requests (OpenWeatherMap API)
- Saving preferences (units, etc.) via User Defaults
- Working with user location

---

## Features

Features functionality might be changed based on how much the API supports this functionality.

- **Tab bar navigation:**
  - **Today:** current weather based on location
  - **10-Day Forecast:** collapsible daily forecast with hourly breakdown
  - **Settings:** choose units (°F/°C, mph/kmh, inches/mm)

- **Today Tab:**
  - City name + weather condition
  - Max/Min temperature
  - UV index (if available)
  - Hourly forecast as a horizontal scrollable row
  - Contextual weather icons (sun, clouds, rain)

- **10-Day Forecast Tab:**
  - List of upcoming days with temperatures and icons
  - Tap to expand and show hourly forecast for selected day
  - Smooth transitions between collapsed and expanded views

- **Settings Tab:**
  - Pick measurement units
  - Persist preferences using UserDefaults

---

## UI Examples
<p align="center">Today Forecast.</p>
<p align="center">
  <img width="300" height="900" alt="Today_Forecast" src="https://github.com/user-attachments/assets/2db1a403-1e97-4a73-bf58-8fe74ca2caeb" />
</p>

<p align="center">10 Days Forecast</p>
<p align="center">
  <img width="300" height="900" alt="Ten_Days_Forecast" src="https://github.com/user-attachments/assets/7b7a4eec-e797-446e-9fa8-4688c954fc6d" />
</p>


<p align="center">Settings</p>
<p align="center">
  <img width="300" height="900" alt="Settings_Screen" src="https://github.com/user-attachments/assets/9f0c8e0d-3c59-4bb1-98aa-d7f2cdcac81b" />
</p>


