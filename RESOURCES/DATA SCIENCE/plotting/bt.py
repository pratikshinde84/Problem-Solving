import hashlib

header = "010000000567b0c437a1d8ec98e67f33a3ff6fda6f5b748e04928452ad5f020000000000b2098f18b6b9db31b0ea00abbb5172c4141f9e427f639542ee820f82b032c60a5a57454d29fa021b6cbafb1e"

block = bytes.fromhex(header)

h1 = hashlib.sha256(block).digest()
h2 = hashlib.sha256(h1).digest()

print(h2[::-1].hex())