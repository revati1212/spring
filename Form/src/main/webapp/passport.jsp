
</body>
</html>
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <form action="/Filled" method="post">
    <title>Passport Seva - User Registration</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            max-width: 600px;
            margin-top: 50px;
            padding: 20px;
            background-color: #ffffff;
            border: 1px solid #dddddd;
            border-radius: 5px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .form-title {
            font-weight: bold;
            font-size: 1.5rem;
            margin-bottom: 20px;
        }
        .form-footer {
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="form-title text-center">User Registration</h1>
        <p><strong>Important Information:</strong> Passport application can be processed at any PSK/POPSK/PSLK WITHIN INDIA irrespective of your residential address.</p>
        <ul>
            <li><a href="#">Click here to check the appointment availability at all PSK/POPSK/PSLK.</a></li>
            <li><a href="#">Click here to know more about Apply Anywhere in India scheme for Passport Services.</a></li>
        </ul>

        <form>
            <div class="mb-3">
                <label for="register-apply" class="form-label">Register to apply at *</label><br>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="register-apply" id="cpv-delhi" value="CPV Delhi">
                    <label class="form-check-label" for="cpv-delhi">CPV Delhi</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="register-apply" id="passport-office" value="Passport Office">
                    <label class="form-check-label" for="passport-office">Passport Office</label>
                </div>
            </div>

            <div class="mb-3">
                <label for="passport-office" class="form-label">Passport Office *</label>
                <select class="form-select" id="passport-office" name="passport-office">
                    <option value="">-- Select --</option>
                    <!-- Add options dynamically -->
                </select>
            </div>

            <div class="mb-3">
                <label for="given-name" class="form-label">Given Name (Max 45 Characters) *</label>
                <input type="text" class="form-control" id="given-name" name="given-name" maxlength="45">
            </div>

            <div class="mb-3">
                <label for="surname" class="form-label">Surname (Max 45 Characters)</label>
                <input type="text" class="form-control" id="surname" name="surname" maxlength="45">
            </div>

            <div class="mb-3">
                <label for="dob" class="form-label">Date of Birth (DD/MM/YYYY) *</label>
                <input type="date" class="form-control" id="dob" name="dob">
            </div>

            <div class="mb-3">
                <label for="email" class="form-label">E-mail (Max 35 Characters) *</label>
                <input type="email" class="form-control" id="email" name="email" maxlength="35">
            </div>

            <div class="mb-3">
                <label class="form-label">Do you want your Login Id to be same as E-mail Id?</label><br>
                <div class="form-check">
                    <input class="form-check-input" type="radio" id="yes" name="login-same-email" value="Yes">
                    <label class="form-check-label" for="yes">Yes</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" id="no" name="login-same-email" value="No">
                    <label class="form-check-label" for="no">No</label>
                </div>
            </div>

            <div class="mb-3">
                <label for="login-id" class="form-label">Login Id *</label>
                <input type="text" class="form-control" id="login-id" name="login-id">
            </div>

            <div class="mb-3">
                <label for="password" class="form-label">Password *</label>
                <input type="password" class="form-control" id="password" name="password">
            </div>

            <div class="mb-3">
                <label for="confirm-password" class="form-label">Confirm Password *</label>
                <input type="password" class="form-control" id="confirm-password" name="confirm-password">
            </div>

            <div class="mb-3">
                <label for="hint-question" class="form-label">Hint Question *</label>
                <select class="form-select" id="hint-question" name="hint-question">
                    <option value="">-- Select --</option>
                    <!-- Add options dynamically -->
                </select>
            </div>

            <div class="mb-3">
                <label for="hint-answer" class="form-label">Hint Answer *</label>
                <input type="text" class="form-control" id="hint-answer" name="hint-answer">
            </div>

            <div class="mb-3">
                <label for="captcha" class="form-label">Enter Characters Displayed *</label>
                <input type="text" class="form-control" id="captcha" name="captcha">
                <img src="#" alt="Captcha" class="img-fluid mt-2">
            </div>

            <div class="form-footer">
                <button type="submit" class="btn btn-primary">Register</button>
                <button type="reset" class="btn btn-secondary">Clear</button>
            </div>
        </form>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>