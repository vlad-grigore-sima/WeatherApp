 WeatherForecastCMP
An experimental weather forecast iOS app built with JetBrains Compose Multiplatform (CMP) to explore:
🌐 Integrating REST APIs (https://openweathermap.org/api)
📱 Designing and implementing tab bars, navigation stacks, and expandable UI in Compose for iOS
☀️ Dynamic and responsive weather UI (daily/hourly forecasts, conditions, images, UV, etc.)
🔄 Transitions and animations in iOS using CMP
📡 HTTP requests (OpenWeatherMap API)
💾 Saving preferences (units, etc.) via NSUserDefaults
🧪 Prototyping real-world UI/UX patterns with Compose for iOS
🔧 Features
Tab bar navigation:
Today: current weather based on location
10-Day Forecast: collapsible daily forecast with hourly breakdown
Settings: choose units (°F/°C, mph/kmh, inches/mm)
Today Tab:
City name + weather condition
Max/Min temperature
UV index (if available)
Hourly forecast as a horizontal scrollable row
Contextual weather icons (sun, clouds, rain)
10-Day Forecast Tab:
List of upcoming days with temperatures and icons
Tap to expand and show hourly forecast for selected day
Smooth transitions between collapsed and expanded views
Settings Tab:
Pick measurement units
Persist preferences using UserDefaults
🛠️ Tech Stack
JetBrains Compose Multiplatform (CMP)
Kotlin Multiplatform (for logic reuse)
OpenWeatherMap API
Swift interop (for iOS integrations like UserDefaults, location)
Native iOS animations and transitions using Compose APIs
🧪 Why This Project?
This is a prototype/dummy app designed for experimentation. It helps explore how well CMP can:
Build a native-feeling iOS weather app
Handle dynamic and data-driven UIs
Perform transitions, animations, and data handling
Integrate with native platform features (location, user defaults)
📸 UI Examples
10-day forecast list view with expandable hourly data
Settings screen with unit options
Current day forecast with visuals
(See /screenshots folder for mockups.)
🚀 Getting Started
Clone this repo
Add your OpenWeatherMap API key
Run on iOS simulator/device
Toggle between tabs and explore features
