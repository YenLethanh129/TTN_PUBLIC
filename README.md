# TTN - Tìm Trọ Nhanh (Room Rental Finder)

A mobile application for finding and posting room rentals in Vietnam. The project consists of an Android client app and a Node.js REST API backend connected to a MySQL database.

## Project Structure

```
TTN_PUBLIC/
├── client/          # Android application (Kotlin)
├── server/          # Node.js REST API backend
└── data.sql         # MySQL database schema and seed data
```

## Features

- **Browse Rooms** – View a paginated list of available rental rooms
- **Search Rooms** – Search by keyword, province, district, or ward
- **Room Details** – View full details including price, area, interior status, deposit, description, address, and contact
- **Post a Room** – Authenticated users can post new rental listings with images
- **Favorites** – Save and manage favorite rooms
- **User Accounts** – Register, log in (with OTP verification via Firebase), and manage your account
- **Address Picker** – Hierarchical address selection (Province → District → Ward)
- **Image Upload** – Upload room images via Cloudinary

## Tech Stack

### Client (Android)
| Technology | Version |
|---|---|
| Language | Kotlin |
| Min SDK | 26 (Android 8.0) |
| Target SDK | 34 (Android 14) |
| Architecture | MVVM |
| Navigation | Jetpack Navigation Component |
| Networking | Retrofit 2 + OkHttp |
| Image Loading | Glide |
| Local Storage | Room Database |
| Auth | Firebase Authentication |
| Async | Kotlin Coroutines |

### Server (Node.js)
| Technology | Details |
|---|---|
| Runtime | Node.js |
| Framework | Express.js |
| Database | MySQL (mysql2) |
| Image Storage | Cloudinary |
| Dev Server | Nodemon |

## Getting Started

### Prerequisites

- Node.js ≥ 18
- MySQL server
- Android Studio (Hedgehog or newer)
- Android device or emulator running API 26+

### Database Setup

1. Create a MySQL database named `ttn`.
2. Import the schema and seed data:
   ```bash
   mysql -u <user> -p ttn < data.sql
   ```

### Server Setup

1. Navigate to the server directory:
   ```bash
   cd server
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Update database credentials in `server/config.js`:
   ```js
   db: {
       host: "localhost",
       user: "your_db_user",
       password: "your_password",
       database: "ttn",
   }
   ```
4. Start the server:
   ```bash
   # Development (auto-reload)
   npm run dev

   # Production
   npm start
   ```
   The server will run on `http://localhost:3000`.

### Client Setup

1. Open the `client/` directory in Android Studio.
2. Update the API base URL in `app/src/main/java/com/ct07/ttn/util/Constants.kt` to point to your server:
   ```kotlin
   const val BASE_URL = "http://<your-server-ip>:3000/"
   ```
3. Add your `google-services.json` file (Firebase project) to `client/app/`.
4. Build and run the app on your device or emulator.

## API Endpoints

### Rooms
| Method | Endpoint | Description |
|---|---|---|
| GET | `/rooms` | Get paginated list of rooms |
| GET | `/searchRoom?query=` | Search rooms by keyword |
| GET | `/searchRoom/province?query=` | Search rooms by province |
| GET | `/searchRoom/district?query=` | Search rooms by district |
| GET | `/searchRoom/ward?query=` | Search rooms by ward |
| POST | `/rooms/add` | Create a new room listing |
| PUT | `/:id` | Update a room |
| DELETE | `/:id` | Delete a room |

### Users
| Method | Endpoint | Description |
|---|---|---|
| POST | `/login` | Log in |
| POST | `/register` | Register a new user |
| POST | `/users/checkPhoneNumber` | Check if a phone number is already registered |

### Addresses
| Method | Endpoint | Description |
|---|---|---|
| GET | `/provinces` | Get all provinces |
| GET | `/districts?province=` | Get districts by province |
| GET | `/wards?district=` | Get wards by district |
| POST | `/address/add` | Add a new address |

### Favorites
| Method | Endpoint | Description |
|---|---|---|
| GET | `/favorites?user_id=` | Get favorites for a user |
| POST | `/favorites/add` | Add a room to favorites |
| POST | `/favorites/remove` | Remove a room from favorites |

### Images
| Method | Endpoint | Description |
|---|---|---|
| POST | *(see routes/images.js)* | Upload room images to Cloudinary |

## License

This project is for educational purposes.
